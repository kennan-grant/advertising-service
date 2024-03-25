package com.amazon.ata.advertising.service.util;

import com.amazon.ata.advertising.service.model.AdvertisementContent;

public class CustomRecord {
    public AdvertisementContent advertisementContent;
    public Double clickThroughRate;

    public CustomRecord(AdvertisementContent advertisementContent, Double clickThroughRate) {
        this.advertisementContent = advertisementContent;
        this.clickThroughRate = clickThroughRate;
    }
}
