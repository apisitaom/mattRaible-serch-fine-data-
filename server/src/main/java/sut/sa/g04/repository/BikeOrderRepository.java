package sut.sa.g04.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.sa.g04.entity.BikeOrder;

@RepositoryRestResource
public interface BikeOrderRepository extends JpaRepository<BikeOrder,Long>{

}
