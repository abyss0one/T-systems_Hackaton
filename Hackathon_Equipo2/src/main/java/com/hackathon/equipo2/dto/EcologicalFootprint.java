package com.hackathon.equipo2.dto;

public class EcologicalFootprint {

	private String Country;
	private String Region;
	private Float Population;
	private Float HDI;
	private Float GDP_per_Capita;
	private Float Cropland_Footprint;
	private Float Grazing_Footprint;
	private Float Forest_Footprint;
	private Float Carbon_Footprint;
	private Float Fish_Footprint;
	private Float Total_Ecological_Footprint;
	private Float Cropland;
	private Float Grazing_Land;
	private Float Forest_Land;
	private Float Fishing_Water;
	private Float Urban_Land;
	private Float Total_Biocapacity;
	private Float Biocapacity_Deficit_or_Reserve;
	private Float Earths_Required;
	private Float Countries_Required;
	private Float Data_Quality;
	
	//Constructor
	
	public EcologicalFootprint() {
	}

	public EcologicalFootprint(String country, String region, Float population, Float hDI, Float gDP_per_Capita,
			Float cropland_Footprint, Float grazing_Footprint, Float forest_Footprint, Float carbon_Footprint,
			Float fish_Footprint, Float total_Ecological_Footprint, Float cropland, Float grazing_Land,
			Float forest_Land, Float fishing_Water, Float urban_Land, Float total_Biocapacity,
			Float biocapacity_Deficit_or_Reserve, Float earths_Required, Float countries_Required, Float data_Quality) {
		Country = country;
		Region = region;
		Population = population;
		HDI = hDI;
		GDP_per_Capita = gDP_per_Capita;
		Cropland_Footprint = cropland_Footprint;
		Grazing_Footprint = grazing_Footprint;
		Forest_Footprint = forest_Footprint;
		Carbon_Footprint = carbon_Footprint;
		Fish_Footprint = fish_Footprint;
		Total_Ecological_Footprint = total_Ecological_Footprint;
		Cropland = cropland;
		Grazing_Land = grazing_Land;
		Forest_Land = forest_Land;
		Fishing_Water = fishing_Water;
		Urban_Land = urban_Land;
		Total_Biocapacity = total_Biocapacity;
		Biocapacity_Deficit_or_Reserve = biocapacity_Deficit_or_Reserve;
		Earths_Required = earths_Required;
		Countries_Required = countries_Required;
		Data_Quality = data_Quality;
	}
	

	//Getters Y Setters
	
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	public Float getPopulation() {
		return Population;
	}
	public void setPopulation(Float population) {
		Population = population;
	}
	public Float getHDI() {
		return HDI;
	}
	public void setHDI(Float hDI) {
		HDI = hDI;
	}
	public Float getGDP_per_Capita() {
		return GDP_per_Capita;
	}
	public void setGDP_per_Capita(Float gDP_per_Capita) {
		GDP_per_Capita = gDP_per_Capita;
	}
	public Float getCropland_Footprint() {
		return Cropland_Footprint;
	}
	public void setCropland_Footprint(Float cropland_Footprint) {
		Cropland_Footprint = cropland_Footprint;
	}
	public Float getGrazing_Footprint() {
		return Grazing_Footprint;
	}
	public void setGrazing_Footprint(Float grazing_Footprint) {
		Grazing_Footprint = grazing_Footprint;
	}
	public Float getForest_Footprint() {
		return Forest_Footprint;
	}
	public void setForest_Footprint(Float forest_Footprint) {
		Forest_Footprint = forest_Footprint;
	}
	public Float getCarbon_Footprint() {
		return Carbon_Footprint;
	}
	public void setCarbon_Footprint(Float carbon_Footprint) {
		Carbon_Footprint = carbon_Footprint;
	}
	public Float getFish_Footprint() {
		return Fish_Footprint;
	}
	public void setFish_Footprint(Float fish_Footprint) {
		Fish_Footprint = fish_Footprint;
	}
	public Float getTotal_Ecological_Footprint() {
		return Total_Ecological_Footprint;
	}
	public void setTotal_Ecological_Footprint(Float total_Ecological_Footprint) {
		Total_Ecological_Footprint = total_Ecological_Footprint;
	}
	public Float getCropland() {
		return Cropland;
	}
	public void setCropland(Float cropland) {
		Cropland = cropland;
	}
	public Float getGrazing_Land() {
		return Grazing_Land;
	}
	public void setGrazing_Land(Float grazing_Land) {
		Grazing_Land = grazing_Land;
	}
	public Float getForest_Land() {
		return Forest_Land;
	}
	public void setForest_Land(Float forest_Land) {
		Forest_Land = forest_Land;
	}
	public Float getFishing_Water() {
		return Fishing_Water;
	}
	public void setFishing_Water(Float fishing_Water) {
		Fishing_Water = fishing_Water;
	}
	public Float getUrban_Land() {
		return Urban_Land;
	}
	public void setUrban_Land(Float urban_Land) {
		Urban_Land = urban_Land;
	}
	public Float getTotal_Biocapacity() {
		return Total_Biocapacity;
	}
	public void setTotal_Biocapacity(Float total_Biocapacity) {
		Total_Biocapacity = total_Biocapacity;
	}
	public Float getBiocapacity_Deficit_or_Reserve() {
		return Biocapacity_Deficit_or_Reserve;
	}
	public void setBiocapacity_Deficit_or_Reserve(Float biocapacity_Deficit_or_Reserve) {
		Biocapacity_Deficit_or_Reserve = biocapacity_Deficit_or_Reserve;
	}
	public Float getEarths_Required() {
		return Earths_Required;
	}
	public void setEarths_Required(Float earths_Required) {
		Earths_Required = earths_Required;
	}
	public Float getCountries_Required() {
		return Countries_Required;
	}
	public void setCountries_Required(Float countries_Required) {
		Countries_Required = countries_Required;
	}
	public Float getData_Quality() {
		return Data_Quality;
	}
	public void setData_Quality(Float data_Quality) {
		Data_Quality = data_Quality;
	}
	
}
