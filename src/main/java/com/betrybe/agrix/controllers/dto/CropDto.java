package com.betrybe.agrix.controllers.dto;

import com.betrybe.agrix.models.entities.Crop;
import java.time.LocalDate;

/**
 * The type Crop dto.
 */
public record CropDto(Long id, String name, Double plantedArea, LocalDate plantedDate,
                      LocalDate harvestDate, Long farmId) {
  public Crop toCrop() {
    return new Crop(id, name, plantedArea, plantedDate, harvestDate, null);
  }

  /**
   * To dto crop dto.
   *
   * @param crop the crop
   * @return the crop dto
   */
  public static CropDto toDto(Crop crop) {
    return new CropDto(
        crop.getId(),
        crop.getName(),
        crop.getPlantedArea(),
        crop.getPlantedDate(),
        crop.getHarvestDate(),
        crop.getFarm().getId());
  }
}
