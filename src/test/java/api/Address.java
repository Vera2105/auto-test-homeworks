package api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

@JsonDeserialize(as = Address.class)
public class Address {
    @JsonProperty("Present")
    public String Present;
    @JsonProperty("Warehouses")
    public int Warehouses;
    @JsonProperty("MainDescription")
    public String MainDescription;
    @JsonProperty("Area")
    public String Area;
    @JsonProperty("Region")
    public String Region;
    @JsonProperty("SettlementTypeCode")
    public String SettlementTypeCode;
    @JsonProperty("Ref")
    public String Ref;
    @JsonProperty("DeliveryCity")
    public String DeliveryCity;
    @JsonProperty("AddressDeliveryAllowed")
    public boolean AddressDeliveryAllowed;
    @JsonProperty("StreetsAvailability")
    public boolean StreetsAvailability;
    @JsonProperty("ParentRegionTypes")
    public String ParentRegionTypes;
    @JsonProperty("ParentRegionCode")
    public String ParentRegionCode;
    @JsonProperty("RegionTypes")
    public String RegionTypes;
    @JsonProperty("RegionTypesCode")
    public String RegionTypesCode;



    @JsonCreator
    public Address( @JsonProperty("Present") String present, @JsonProperty("Warehouses") int warehouses,
                    @JsonProperty("MainDescription") String mainDescription, @JsonProperty("Area") String area,
                    @JsonProperty("Region") String region, @JsonProperty("SettlementTypeCode") String settlementTypeCode,
                    @JsonProperty("Ref") String ref, @JsonProperty("DeliveryCity") String deliveryCity,
                    @JsonProperty("AddressDeliveryAllowed") boolean addressDeliveryAllowed,
                    @JsonProperty("StreetsAvailability") boolean streetsAvailability,
                    @JsonProperty("ParentRegionTypes") String parentRegionTypes,
                    @JsonProperty("ParentRegionCode") String parentRegionCode,
                    @JsonProperty("RegionTypes") String regionTypes,
                    @JsonProperty("RegionTypesCode")String regionTypesCode) {
        this.Present = present;
        this.Warehouses = warehouses;
        this.MainDescription = mainDescription;
        this.Area = area;
        this.Region = region;
        this.SettlementTypeCode = settlementTypeCode;
        this.Ref = ref;
        this.DeliveryCity = deliveryCity;
        this.AddressDeliveryAllowed = addressDeliveryAllowed;
        this.StreetsAvailability = streetsAvailability;
        this.ParentRegionTypes = parentRegionTypes;
        this.ParentRegionCode = parentRegionCode;
        this.RegionTypes = regionTypes;
        this.RegionTypesCode = regionTypesCode;
    }

        @Getter
        public String getPresent() {
            return Present;
        }
        @Getter
        public int getWarehouses() {
            return Warehouses;
        }
        @Getter
        public String getMainDescription() {
            return MainDescription;
        }
        @Getter
        public String getArea() {
            return Area;
        }
        @Getter
        public String getRegion() {
            return Region;
        }
        @Getter
        public String getSettlementTypeCode() {
            return SettlementTypeCode;
        }
        @Getter
        public String getRef() {
            return Ref;
        }
        @Getter
        public String getDeliveryCity() {
            return DeliveryCity;
        }
        @Getter
        public boolean isAddressDeliveryAllowed() {
            return AddressDeliveryAllowed;
        }
        @Getter
        public boolean isStreetsAvailability() {
            return StreetsAvailability;
        }
        @Getter
        public String getParentRegionTypes() {
            return ParentRegionTypes;
        }
        @Getter
        public String getParentRegionCode() {
            return ParentRegionCode;
        }
        @Getter
        public String getRegionTypes() {
            return RegionTypes;
        }
        @Getter
        public String getRegionTypesCode() {
            return RegionTypesCode;
        }

        @Setter
    public void setPresent(String present) {
        Present = present;
    }
    @Setter
    public void setWarehouses(int warehouses) {
        Warehouses = warehouses;
    }
    @Setter
    public void setMainDescription(String mainDescription) {
        MainDescription = mainDescription;
    }
    @Setter
    public void setArea(String area) {
        Area = area;
    }
    @Setter
    public void setRegion(String region) {
        Region = region;
    }
    @Setter
    public void setSettlementTypeCode(String settlementTypeCode) {
        SettlementTypeCode = settlementTypeCode;
    }
    @Setter
    public void setRef(String ref) {
        Ref = ref;
    }
    @Setter
    public void setDeliveryCity(String deliveryCity) {
        DeliveryCity = deliveryCity;
    }
    @Setter
    public void setAddressDeliveryAllowed(boolean addressDeliveryAllowed) {
        AddressDeliveryAllowed = addressDeliveryAllowed;
    }
    @Setter
    public void setStreetsAvailability(boolean streetsAvailability) {
        StreetsAvailability = streetsAvailability;
    }
    @Setter
    public void setParentRegionTypes(String parentRegionTypes) {
        ParentRegionTypes = parentRegionTypes;
    }
    @Setter
    public void setParentRegionCode(String parentRegionCode) {
        ParentRegionCode = parentRegionCode;
    }
    @Setter
    public void setRegionTypes(String regionTypes) {
        RegionTypes = regionTypes;
    }
    @Setter
    public void setRegionTypesCode(String regionTypesCode) {
        RegionTypesCode = regionTypesCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Present='" + Present + '\'' +
                ", Warehouses=" + Warehouses +
                ", MainDescription='" + MainDescription + '\'' +
                ", Area='" + Area + '\'' +
                ", Region='" + Region + '\'' +
                ", SettlementTypeCode='" + SettlementTypeCode + '\'' +
                ", Ref='" + Ref + '\'' +
                ", DeliveryCity='" + DeliveryCity + '\'' +
                ", AddressDeliveryAllowed=" + AddressDeliveryAllowed +
                ", StreetsAvailability=" + StreetsAvailability +
                ", ParentRegionTypes='" + ParentRegionTypes + '\'' +
                ", ParentRegionCode='" + ParentRegionCode + '\'' +
                ", RegionTypes='" + RegionTypes + '\'' +
                ", RegionTypesCode='" + RegionTypesCode + '\'' +
                '}';
    }
}
