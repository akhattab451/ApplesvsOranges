package com.example.applesvsoranges.util;

public interface Mapper<DataTransferObject, Domain> {

    public Domain mapFromDTO(DataTransferObject object);
}
