package com.wesley.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wesley.loja.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}