package br.com.eugenio.projeto.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
