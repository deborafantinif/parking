package dff.parking.spot.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dff.parking.spot.models.ParkingSpotModel;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
  
  boolean existsByPlateCar(String plateCar);
  boolean existsByParkingSpotNumber(String parkingSpotNumber);
  boolean existsByFloor(String floor, String block);
}