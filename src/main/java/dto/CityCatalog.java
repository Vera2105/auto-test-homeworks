package dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

@JsonDeserialize(as = CityCatalog.class)
public class CityCatalog {
    @JsonProperty("Ref")
    public String Ref;
    @JsonProperty("SettlementType")
    public String SettlementType;
    @JsonProperty("Latitude")
    public String Latitude;
    @JsonProperty("Longitude")
    public String Longitude;
    @JsonProperty("Description")
    public String Description;
    @JsonProperty("DescriptionRu")
    public String DescriptionRu;
    @JsonProperty("DescriptionTranslit")
    public String DescriptionTranslit;
    @JsonProperty("SettlementTypeDescription")
    public String SettlementTypeDescription;
    @JsonProperty("SettlementTypeDescriptionRu")
    public String SettlementTypeDescriptionRu;
    @JsonProperty("SettlementTypeDescriptionTranslit")
    public String SettlementTypeDescriptionTranslit;
    @JsonProperty("Region")
    public String Region;
    @JsonProperty("RegionsDescription")
    public String RegionsDescription;
    @JsonProperty("RegionsDescriptionRu")
    public String RegionsDescriptionRu;
    @JsonProperty("RegionsDescriptionTranslit")
    public String RegionsDescriptionTranslit;
    @JsonProperty("Area")
    public String Area;
    @JsonProperty("AreaDescription")
    public String AreaDescription;
    @JsonProperty("AreaDescriptionRu")
    public String AreaDescriptionRu;
    @JsonProperty("AreaDescriptionTranslit")
    public String AreaDescriptionTranslit;
    @JsonProperty("Index1")
    public String Index1;
    @JsonProperty("Index2")
    public String Index2;
    @JsonProperty("IndexCOATSU1")
    public String IndexCOATSU1;
    @JsonProperty("Delivery1")
    public String Delivery1;
    @JsonProperty("Delivery2")
    public String Delivery2;
    @JsonProperty("Delivery3")
    public String Delivery3;
    @JsonProperty("Delivery4")
    public String Delivery4;
    @JsonProperty("Delivery5")
    public String Delivery5;
    @JsonProperty("Delivery6")
    public String Delivery6;
    @JsonProperty("Delivery7")
    public String Delivery7;
    @JsonProperty("SpecialCashCheck")
    public int SpecialCashCheck;
    @JsonProperty("Warehouse")
    public String Warehouse;

    @JsonCreator
    CityCatalog(@JsonProperty("Ref") String Ref, @JsonProperty("SettlementType") String SettlementType,
                @JsonProperty("Latitude") String Latitude, @JsonProperty("Longitude") String Longitude,
                @JsonProperty("Description") String Description, @JsonProperty("DescriptionRu") String DescriptionRu,
                @JsonProperty("DescriptionTranslit") String DescriptionTranslit, @JsonProperty("SettlementTypeDescription")
                String SettlementTypeDescription, @JsonProperty("SettlementTypeDescriptionRu") String SettlementTypeDescriptionRu,
                @JsonProperty("SettlementTypeDescriptionTranslit") String SettlementTypeDescriptionTranslit,
                @JsonProperty("Region") String Region, @JsonProperty("RegionsDescription") String RegionsDescription,
                @JsonProperty("RegionsDescriptionRu") String RegionsDescriptionRu, @JsonProperty("RegionsDescriptionTranslit")
                String RegionsDescriptionTranslit, @JsonProperty("Area") String Area,
                @JsonProperty("AreaDescription") String AreaDescription, @JsonProperty("AreaDescriptionRu") String AreaDescriptionRu,
                @JsonProperty("AreaDescriptionTranslit") String AreaDescriptionTranslit, @JsonProperty("Index1") String Index1,
                @JsonProperty("Index2") String Index2, @JsonProperty("IndexCOATSU1") String IndexCOATSU1,
                @JsonProperty("Delivery1") String Delivery1, @JsonProperty("Delivery2") String Delivery2,
                @JsonProperty("Delivery3") String Delivery3, @JsonProperty("Delivery4") String Delivery4,
                @JsonProperty("Delivery5") String Delivery5, @JsonProperty("Delivery6") String Delivery6,
                @JsonProperty("Delivery7") String Delivery7, @JsonProperty("SpecialCashCheck")
                int SpecialCashCheck, @JsonProperty("Warehouse") String Warehouse) {
        this.Ref = Ref;
        this.SettlementType = SettlementType;
        this.Latitude = Latitude;
        this.Longitude = Longitude;
        this.Description = Description;
        this.DescriptionRu = DescriptionRu;
        this.DescriptionTranslit = DescriptionTranslit;
        this.SettlementTypeDescription = SettlementTypeDescription;
        this.SettlementTypeDescriptionRu = SettlementTypeDescriptionRu;
        this.SettlementTypeDescriptionTranslit = SettlementTypeDescriptionTranslit;
        this.Region = Region;
        this.RegionsDescription = RegionsDescription;
        this.RegionsDescriptionRu = RegionsDescriptionRu;
        this.RegionsDescriptionTranslit = RegionsDescriptionTranslit;
        this.Area = Area;
        this.AreaDescription = AreaDescription;
        this.AreaDescriptionRu = AreaDescriptionRu;
        this.AreaDescriptionTranslit = AreaDescriptionTranslit;
        this.Index1 = Index1;
        this.Index2 = Index2;
        this.IndexCOATSU1 = IndexCOATSU1;
        this.Delivery1 = Delivery1;
        this.Delivery2 = Delivery2;
        this.Delivery3 = Delivery3;
        this.Delivery4 = Delivery4;
        this.Delivery5 = Delivery5;
        this.Delivery6 = Delivery6;
        this.Delivery7 = Delivery7;
        this.SpecialCashCheck = SpecialCashCheck;
        this.Warehouse = Warehouse;
    }

    @Getter
    public String getRef() {
        return Ref;
    }

    @Getter
    public String getSettlementType() {
        return SettlementType;
    }

    @Getter
    public String getLatitude() {
        return Latitude;
    }

    @Getter
    public String getLongitude() {
        return Longitude;
    }

    @Getter
    public String getDescription() {
        return Description;
    }

    @Getter
    public String getDescriptionRu() {
        return DescriptionRu;
    }

    @Getter
    public String getDescriptionTranslit() {
        return DescriptionTranslit;
    }

    @Getter
    public String getSettlementTypeDescription() {
        return SettlementTypeDescription;
    }

    @Getter
    public String getSettlementTypeDescriptionRu() {
        return SettlementTypeDescriptionRu;
    }

    @Getter
    public String getSettlementTypeDescriptionTranslit() {
        return SettlementTypeDescriptionTranslit;
    }

    @Getter
    public String getRegion() {
        return Region;
    }

    @Getter
    public String getRegionsDescription() {
        return RegionsDescription;
    }

    @Getter
    public String getRegionsDescriptionRu() {
        return RegionsDescriptionRu;
    }

    @Getter
    public String getRegionsDescriptionTranslit() {
        return RegionsDescriptionTranslit;
    }

    @Getter
    public String getArea() {
        return Area;
    }

    @Getter
    public String getAreaDescription() {
        return AreaDescription;
    }

    @Getter
    public String getAreaDescriptionRu() {
        return AreaDescriptionRu;
    }

    @Getter
    public String getAreaDescriptionTranslit() {
        return AreaDescriptionTranslit;
    }

    @Getter
    public String getIndex1() {
        return Index1;
    }

    @Getter
    public String getIndex2() {
        return Index2;
    }

    @Getter
    public String getIndexCOATSU1() {
        return IndexCOATSU1;
    }

    @Getter
    public String getDelivery1() {
        return Delivery1;
    }

    @Getter
    public String getDelivery2() {
        return Delivery2;
    }

    @Getter
    public String getDelivery3() {
        return Delivery3;
    }

    @Getter
    public String getDelivery4() {
        return Delivery4;
    }

    @Getter
    public String getDelivery5() {
        return Delivery5;
    }

    @Getter
    public String getDelivery6() {
        return Delivery6;
    }

    @Getter
    public String getDelivery7() {
        return Delivery7;
    }

    @Getter
    public int getSpecialCashCheck() {
        return SpecialCashCheck;
    }

    @Getter
    public String getWarehouse() {
        return Warehouse;
    }

    @Setter
    public void setRef(String ref) {
        Ref = ref;
    }

    @Setter
    public void setSettlementType(String settlementType) {
        SettlementType = settlementType;
    }

    @Setter
    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    @Setter
    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    @Setter
    public void setDescription(String description) {
        Description = description;
    }

    @Setter
    public void setDescriptionRu(String descriptionRu) {
        DescriptionRu = descriptionRu;
    }

    @Setter
    public void setDescriptionTranslit(String descriptionTranslit) {
        DescriptionTranslit = descriptionTranslit;
    }

    @Setter
    public void setSettlementTypeDescription(String settlementTypeDescription) {
        SettlementTypeDescription = settlementTypeDescription;
    }

    @Setter
    public void setSettlementTypeDescriptionRu(String settlementTypeDescriptionRu) {
        SettlementTypeDescriptionRu = settlementTypeDescriptionRu;
    }

    @Setter
    public void setSettlementTypeDescriptionTranslit(String settlementTypeDescriptionTranslit) {
        SettlementTypeDescriptionTranslit = settlementTypeDescriptionTranslit;
    }

    @Setter
    public void setRegion(String region) {
        Region = region;
    }

    @Setter
    public void setRegionsDescription(String regionsDescription) {
        RegionsDescription = regionsDescription;
    }

    @Setter
    public void setRegionsDescriptionRu(String regionsDescriptionRu) {
        RegionsDescriptionRu = regionsDescriptionRu;
    }

    @Setter
    public void setRegionsDescriptionTranslit(String regionsDescriptionTranslit) {
        RegionsDescriptionTranslit = regionsDescriptionTranslit;
    }

    @Setter
    public void setArea(String area) {
        Area = area;
    }

    @Setter
    public void setAreaDescription(String areaDescription) {
        AreaDescription = areaDescription;
    }

    @Setter
    public void setAreaDescriptionRu(String areaDescriptionRu) {
        AreaDescriptionRu = areaDescriptionRu;
    }

    @Setter
    public void setAreaDescriptionTranslit(String areaDescriptionTranslit) {
        AreaDescriptionTranslit = areaDescriptionTranslit;
    }

    @Setter
    public void setIndex1(String index1) {
        Index1 = index1;
    }

    @Setter
    public void setIndex2(String index2) {
        Index2 = index2;
    }

    @Setter
    public void setIndexCOATSU1(String indexCOATSU1) {
        IndexCOATSU1 = indexCOATSU1;
    }

    @Setter
    public void setDelivery1(String delivery1) {
        Delivery1 = delivery1;
    }

    @Setter
    public void setDelivery2(String delivery2) {
        Delivery2 = delivery2;
    }

    @Setter
    public void setDelivery3(String delivery3) {
        Delivery3 = delivery3;
    }

    @Setter
    public void setDelivery4(String delivery4) {
        Delivery4 = delivery4;
    }

    @Setter
    public void setDelivery5(String delivery5) {
        Delivery5 = delivery5;
    }

    @Setter
    public void setDelivery6(String delivery6) {
        Delivery6 = delivery6;
    }

    @Setter
    public void setDelivery7(String delivery7) {
        Delivery7 = delivery7;
    }

    @Setter
    public void setSpecialCashCheck(int specialCashCheck) {
        SpecialCashCheck = specialCashCheck;
    }

    @Setter
    public void setWarehouse(String warehouse) {
        Warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "CityCatalog{" +
                "Ref='" + Ref + '\'' +
                ", SettlementType='" + SettlementType + '\'' +
                ", Latitude='" + Latitude + '\'' +
                ", Longitude='" + Longitude + '\'' +
                ", Description='" + Description + '\'' +
                ", DescriptionRu='" + DescriptionRu + '\'' +
                ", DescriptionTranslit='" + DescriptionTranslit + '\'' +
                ", SettlementTypeDescription='" + SettlementTypeDescription + '\'' +
                ", SettlementTypeDescriptionRu='" + SettlementTypeDescriptionRu + '\'' +
                ", SettlementTypeDescriptionTranslit='" + SettlementTypeDescriptionTranslit + '\'' +
                ", Region='" + Region + '\'' +
                ", RegionsDescription='" + RegionsDescription + '\'' +
                ", RegionsDescriptionRu='" + RegionsDescriptionRu + '\'' +
                ", RegionsDescriptionTranslit='" + RegionsDescriptionTranslit + '\'' +
                ", Area='" + Area + '\'' +
                ", AreaDescription='" + AreaDescription + '\'' +
                ", AreaDescriptionRu='" + AreaDescriptionRu + '\'' +
                ", AreaDescriptionTranslit='" + AreaDescriptionTranslit + '\'' +
                ", Index1='" + Index1 + '\'' +
                ", Index2='" + Index2 + '\'' +
                ", IndexCOATSU1='" + IndexCOATSU1 + '\'' +
                ", Delivery1='" + Delivery1 + '\'' +
                ", Delivery2='" + Delivery2 + '\'' +
                ", Delivery3='" + Delivery3 + '\'' +
                ", Delivery4='" + Delivery4 + '\'' +
                ", Delivery5='" + Delivery5 + '\'' +
                ", Delivery6='" + Delivery6 + '\'' +
                ", Delivery7='" + Delivery7 + '\'' +
                ", SpecialCashCheck=" + SpecialCashCheck +
                ", Warehouse='" + Warehouse + '\'' +
                '}';
    }
}
