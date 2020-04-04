package com.rusinek.msscrestdocsexample.repositories;

import com.rusinek.msscrestdocsexample.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by Adrian Rusinek on 03.04.2020
 **/
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
