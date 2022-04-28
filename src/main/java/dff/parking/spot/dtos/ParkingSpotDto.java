package dff.parking.spot.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ParkingSpotDto {
  
  @NotBlank
  private String parkingSpotNumber;

  @NotBlank
  @Size(max = 7)
  private String plateCar;

  @NotBlank
  private String brandCar;

  @NotBlank
  private String modelCar;

  @NotBlank
  private String colorCar;

  @NotBlank
  private String nameResponsibleCar;

  @NotBlank
  private String floor;

  @NotBlank
  private String block;

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