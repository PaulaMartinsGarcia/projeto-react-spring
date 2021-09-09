package com.projetoreactspring.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoreactspring.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
