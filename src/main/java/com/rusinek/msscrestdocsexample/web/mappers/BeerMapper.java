package com.rusinek.msscrestdocsexample.web.mappers;

import com.rusinek.msscrestdocsexample.domain.Beer;
import com.rusinek.msscrestdocsexample.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by Adrian Rusinek on 04.04.2020
 **/
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
