package com.mera.bicis.api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BiciRepository extends CrudRepository<Bici, Long> {

    public List<Bici> findAll();

    public Optional<Bici> findById(Long id);

    public Bici save(Bici b);

    public void deleteById(Long id);
}
