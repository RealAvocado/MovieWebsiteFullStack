package com.example.moviewebsite.movie_data.objectsFromJson.streaming_service;

import com.example.moviewebsite.movie_data.objectsFromJson.country.Country;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class Netflix {

    @JsonAlias({"ar","at","au","be","br","ca","ch","cl","co","cz","de","dk","ec","ee","es","fi","fr","gb","gr","hu","id","ie","in","it","jp","kr","lt","mx","my","nl","no","nz","pe","ph","pl","pt","ro","se","sg","th","tr","us","za","hr","az","bg","cy","hk","is","il","md","mk","rs","ua","ae","vn","pa"})
    private Country country;

    public Netflix() {
    }

    public Netflix(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Netflix{" + "country=" + country + '}';
    }
}