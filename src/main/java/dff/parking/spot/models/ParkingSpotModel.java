package dff.parking.spot.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.*;

@Entity
@Table(name = "TB_PARKING_SPOT")
public class ParkingSpotModel implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column(nullable = false, unique = true, length = 10)
  private String parkingSpotNumber;

  @Column(nullable = false, unique = true, length = 7)
  private String plateCar;

  @Column(unique = true, length = 70)
  private String brandCar;

  @Column(unique = true, length = 70)
  private String modelCar;

  @Column(nullable = false, unique = true, length = 70)
  private String colorCar;

  @Column(nullable = false)
  private LocalDateTime dateInside;

  @Column(nullable = false, length = 130)
  private String nameResponsibleCar;

  @Column(nullable = false, length = 30)
  private String floor;

  @Column(nullable = false, length = 30)
  private String block;

    /**
     * @return UUID return the id
     */
    public UUID getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * @return String return the parkingSpotNumber
     */
    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    /**
     * @param parkingSpotNumber the parkingSpotNumber to set
     */
    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    /**
     * @return String return the plateCar
     */
    public String getPlateCar() {
        return plateCar;
    }

    /**
     * @param plateCar the plateCar to set
     */
    public void setPlateCar(String plateCar) {
        this.plateCar = plateCar;
    }

    /**
     * @return String return the brandCar
     */
    public String getBrandCar() {
        return brandCar;
    }

    /**
     * @param brandCar the brandCar to set
     */
    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    /**
     * @return String return the modelCar
     */
    public String getModelCar() {
        return modelCar;
    }

    /**
     * @param modelCar the modelCar to set
     */
    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    /**
     * @return String return the colorCar
     */
    public String getColorCar() {
        return colorCar;
    }

    /**
     * @param colorCar the colorCar to set
     */
    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    /**
     * @return LocalDateTime return the dateInside
     */
    public LocalDateTime getDateInside() {
        return dateInside;
    }

    /**
     * @param dateInside the dateInside to set
     */
    public void setDateInside(LocalDateTime dateInside) {
        this.dateInside = dateInside;
    }

    /**
     * @return String return the nameResponsibleCar
     */
    public String getNameResponsibleCar() {
        return nameResponsibleCar;
    }

    /**
     * @param nameResponsibleCar the nameResponsibleCar to set
     */
    public void setNameResponsibleCar(String nameResponsibleCar) {
        this.nameResponsibleCar = nameResponsibleCar;
    }

    /**
     * @return String return the floor
     */
    public String getFloor() {
        return floor;
    }

    /**
     * @param floor the floor to set
     */
    public void setFloor(String floor) {
        this.floor = floor;
    }

    /**
     * @return String return the block
     */
    public String getBlock() {
        return block;
    }

    /**
     * @param block the block to set
     */
    public void setBlock(String block) {
        this.block = block;
    }

}