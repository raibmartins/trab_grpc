package net.unesc;

import generated.*;
import io.grpc.stub.StreamObserver;

import java.sql.*;
import static net.unesc.Utils.*;

public class ListaTelefonicaService extends ListaGrpc.ListaImplBase {

    private static Connection connection;
    private final String url = "jdbc:postgresql://localhost/postgres";
    private final String user = "postgres";
    private final String password = "postgres";

    private static final String INSERT = "INSERT INTO LISTA_TELEFONICA(NOME_PESSOA, NUMERO) VALUES (?, ?);";
    private static final String SELECT_BY_NUMERO = "SELECT * FROM LISTA_TELEFONICA WHERE NUMERO = ?";
    private static final String SELECT = "SELECT * FROM LISTA_TELEFONICA;";
    private static final String DELETE = "DELETE FROM LISTA_TELEFONICA WHERE ID = ?;";
    private static final String SELECT_FROM_PESSOA = "SELECT * FROM LISTA_TELEFONICA WHERE NOME_PESSOA ILIKE ?;";
    private static final String UPDATE = "UPDATE LISTA_TELEFONICA SET NUMERO = ? WHERE NUMERO = ?;";

    public ListaTelefonicaService() {
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void create(CreateRequest request, StreamObserver<Response> responseObserver) {
        Response.Builder response = Response.newBuilder();
        try {
            if (Utils.validateRegex(request.getNumero())) {
                String numero = Utils.deformatNumero(request.getNumero());

                PreparedStatement existStatement = connection.prepareStatement(SELECT_BY_NUMERO);
                existStatement.setString(1, numero);
                ResultSet resultSet = existStatement.executeQuery();

                if (resultSet.next()) {
                    response
                            .setStatusCode(400)
                            .setMessage(String.format("Número %s já foi registrado", request.getNumero()));
                } else {
                    PreparedStatement createStatement = connection.prepareStatement(INSERT);

                    createStatement.setString(1, request.getNomePessoa());
                    createStatement.setString(2, numero);
                    createStatement.executeUpdate();
                    createStatement.close();

                    response
                            .setStatusCode(200)
                            .setMessage("Número salvo com sucesso");
                }
                existStatement.close();
            } else {
                response
                        .setStatusCode(400)
                        .setMessage("O número deve seguir o padrão (XX) XXXXX-XXXX");
            }
        } catch (Exception e) {
            response
                    .setStatusCode(500)
                    .setMessage("Aconteceu um erro inesperado ao tentar realizar a requisição");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void delete(DeleteRequest request, StreamObserver<Response> responseObserver) {
        Response.Builder response = Response.newBuilder();
        try {
            if (Utils.validateRegex(request.getNumero())) {
                String numero = Utils.deformatNumero(request.getNumero());
                PreparedStatement select = connection.prepareStatement(SELECT_BY_NUMERO);
                select.setString(1, numero);
                ResultSet resultSet = select.executeQuery();

                if (resultSet.next()) {
                    Integer id = (Integer) resultSet.getObject(1);
                    PreparedStatement deleteStatement = connection.prepareStatement(DELETE);
                    deleteStatement.setInt(1, id);
                    deleteStatement.executeUpdate();
                    deleteStatement.close();
                    response
                            .setStatusCode(200)
                            .setMessage("Número excluído com sucesso.");
                } else {
                    response
                            .setStatusCode(400)
                            .setMessage(String.format("O Número %s não existe.", request.getNumero()));
                }
                select.close();
            } else {
                response
                        .setStatusCode(400)
                        .setMessage("O número deve seguir o padrão (XX) XXXXX-XXXX");
                responseObserver.onNext(response.build());
                responseObserver.onCompleted();
            }
        } catch (Exception e) {
            response
                    .setStatusCode(500)
                    .setMessage("Aconteceu um erro inesperado ao tentar realizar a requisição");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void update(UpdateRequest request, StreamObserver<Response> responseObserver) {
        Response.Builder response = Response.newBuilder();
        try {
            if (!Utils.validateRegex(request.getNovoNumero())) {
                response
                        .setStatusCode(400)
                        .setMessage("O novo número deve seguir o padrão (XX) XXXXX-XXXX");
            } else if (!Utils.validateRegex(request.getNumeroAntigo())) {
                response
                        .setStatusCode(400)
                        .setMessage("O número antigo deve seguir o padrão (XX) XXXXX-XXXX");
            } else {
                String antigo = Utils.deformatNumero(request.getNumeroAntigo());
                String novo = Utils.deformatNumero(request.getNovoNumero());
                PreparedStatement updateStatement = connection.prepareStatement(UPDATE);
                updateStatement.setString(1, novo);
                updateStatement.setString(2, antigo);
                int i = updateStatement.executeUpdate();

                response
                        .setStatusCode(200)
                        .setMessage("Número atualizado com sucesso.");
                updateStatement.close();
            }
        } catch (Exception e) {
            response
                    .setStatusCode(500)
                    .setMessage("Aconteceu um erro inesperado ao tentar realizar a requisição");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void read(ReadOneRequest request, StreamObserver<Response> responseObserver) {
        Response.Builder response = Response.newBuilder();
        try {
            PreparedStatement select = connection.prepareStatement(SELECT_FROM_PESSOA);
            select.setString(1, "%" + request.getNomePessoa() + "%");
            ResultSet resultSet = select.executeQuery();
            String retorno = Utils.montaRetorno(resultSet);

            if (retorno.isEmpty()) {
                response
                        .setStatusCode(200)
                        .setMessage(String.format("Não existem números cadastrados para o(a) %s.", request.getNomePessoa()));
            } else {
                response
                        .setStatusCode(200)
                        .setMessage(retorno.substring(0, retorno.length() - 1));
            }
            select.close();
        } catch (Exception e) {
            response
                    .setStatusCode(500)
                    .setMessage("Aconteceu um erro inesperado ao tentar realizar a requisição");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void readAll(Empty request, StreamObserver<Response> responseObserver) {
        Response.Builder response = Response.newBuilder();
        try {
            PreparedStatement select = connection.prepareStatement(SELECT);
            ResultSet resultSet = select.executeQuery();
            String retorno = Utils.montaRetorno(resultSet);

            if (retorno.isEmpty()) {
                response
                        .setStatusCode(200)
                        .setMessage("Não existem números cadastrados.");
            } else {
                response
                        .setStatusCode(200)
                        .setMessage(retorno.substring(0, retorno.length() - 1));
            }
            select.close();
        } catch (Exception e) {
            response
                    .setStatusCode(500)
                    .setMessage("Aconteceu um erro inesperado ao tentar realizar a requisição");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
