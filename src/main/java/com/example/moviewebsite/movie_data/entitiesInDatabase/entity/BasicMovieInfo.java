package com.example.moviewebsite.movie_data.entitiesInDatabase.entity;

import com.example.moviewebsite.user_data.entity.CollectionList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "basic_movie_info")
@SecondaryTables({
        @SecondaryTable(name = "backdrop_URLs", pkJoinColumns = @PrimaryKeyJoinColumn(name = "imdbID")),
        @SecondaryTable(name = "poster_URLs", pkJoinColumns = @PrimaryKeyJoinColumn(name = "imdbID")),
        @SecondaryTable(name = "streaming_link", pkJoinColumns = @PrimaryKeyJoinColumn(name = "imdbID"))
})
public class BasicMovieInfo {
    @Id
    @Column(name = "imdbID")
    private String imdbID;
    private String originalTitle;
    private String language;
    private Integer year;
    @Column(length = 1000)
    private String overview;
    private Integer imdbRating;

    @Column(table = "backdrop_URLs")
    private String backdrop_1280;
    @Column(table = "backdrop_URLs")
    private String backdrop_300;
    @Column(table = "backdrop_URLs")
    private String backdrop_780;
    @Column(table = "backdrop_URLs")
    private String backdrop_original;

    @Column(table = "poster_URLs")
    private String poster_154;
    @Column(table = "poster_URLs")
    private String poster_185;
    @Column(table = "poster_URLs")
    private String poster_342;
    @Column(table = "poster_URLs")
    private String poster_500;
    @Column(table = "poster_URLs")
    private String poster_780;
    @Column(table = "poster_URLs")
    private String poster_92;
    @Column(table = "poster_URLs")
    private String poster_original;

    @Column(table = "streaming_link")
    private String netflixLink;
    @Column(table = "streaming_link")
    private String primeLink;
    @Column(table = "streaming_link")
    private String disneyLink;
    @Column(table = "streaming_link")
    private String paramountLink;
    @Column(table = "streaming_link")
    private String starzLink;
    @Column(table = "streaming_link")
    private String peacockLink;
    @Column(table = "streaming_link")
    private String huluLink;
    @Column(table = "streaming_link")
    private String hboLink;
    @Column(table = "streaming_link")
    private String appleLink;
    @Column(table = "streaming_link")
    private String showtimeLink;
    @Column(table = "streaming_link")
    private String mubiLink;
    @Column(table = "streaming_link")
    private String curiosityLink;
    @Column(table = "streaming_link")
    private String all4Link;
    @Column(table = "streaming_link")
    private String craveLink;
    @Column(table = "streaming_link")
    private String iplayerLink;

    @JsonIgnoreProperties(value = { "basicMovieInfo" })
    @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, mappedBy = "basicMovieInfo")
    private Set<MovieCastPair> movieCastPairList = new HashSet<>();

    @JsonIgnoreProperties(value = { "basicMovieInfo" })
    @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, mappedBy = "basicMovieInfo")
    private Set<MovieCountryPair> movieCountryPairList = new HashSet<>();

    @JsonIgnoreProperties(value = { "basicMovieInfo" })
    @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, mappedBy = "basicMovieInfo")
    private Set<MovieGenrePair> movieGenrePairList = new HashSet<>();

    @JsonIgnoreProperties(value = { "basicMovieInfo" })
    @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, mappedBy = "basicMovieInfo")
    private Set<CollectionList> collectionList = new HashSet<>();

    public BasicMovieInfo() {
    }

    public BasicMovieInfo(String imdbID, String originalTitle, String language, Integer year, String overview, Integer imdbRating,
                          String backdrop_1280, String backdrop_300, String backdrop_780, String backdrop_original,
                          String poster_154, String poster_185, String poster_342, String poster_500, String poster_780, String poster_92, String poster_original,
                          String netflixLink, String primeLink, String disneyLink, String paramountLink, String starzLink, String peacockLink, String huluLink, String hboLink, String appleLink, String showtimeLink, String mubiLink, String curiosityLink, String all4Link, String craveLink, String iplayerLink) {
        this.imdbID = imdbID;
        this.originalTitle = originalTitle;
        this.language = language;
        this.year = year;
        this.overview = overview;
        this.imdbRating = imdbRating;
        this.backdrop_1280 = backdrop_1280;
        this.backdrop_300 = backdrop_300;
        this.backdrop_780 = backdrop_780;
        this.backdrop_original = backdrop_original;
        this.poster_154 = poster_154;
        this.poster_185 = poster_185;
        this.poster_342 = poster_342;
        this.poster_500 = poster_500;
        this.poster_780 = poster_780;
        this.poster_92 = poster_92;
        this.poster_original = poster_original;
        this.netflixLink = netflixLink;
        this.primeLink = primeLink;
        this.disneyLink = disneyLink;
        this.paramountLink = paramountLink;
        this.starzLink = starzLink;
        this.peacockLink = peacockLink;
        this.huluLink = huluLink;
        this.hboLink = hboLink;
        this.appleLink = appleLink;
        this.showtimeLink = showtimeLink;
        this.mubiLink = mubiLink;
        this.curiosityLink = curiosityLink;
        this.all4Link = all4Link;
        this.craveLink = craveLink;
        this.iplayerLink = iplayerLink;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Integer getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(Integer imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getBackdrop_1280() {
        return backdrop_1280;
    }

    public void setBackdrop_1280(String backdrop_1280) {
        this.backdrop_1280 = backdrop_1280;
    }

    public String getBackdrop_300() {
        return backdrop_300;
    }

    public void setBackdrop_300(String backdrop_300) {
        this.backdrop_300 = backdrop_300;
    }

    public String getBackdrop_780() {
        return backdrop_780;
    }

    public void setBackdrop_780(String backdrop_780) {
        this.backdrop_780 = backdrop_780;
    }

    public String getBackdrop_original() {
        return backdrop_original;
    }

    public void setBackdrop_original(String backdrop_original) {
        this.backdrop_original = backdrop_original;
    }

    public String getPoster_154() {
        return poster_154;
    }

    public void setPoster_154(String poster_154) {
        this.poster_154 = poster_154;
    }

    public String getPoster_185() {
        return poster_185;
    }

    public void setPoster_185(String poster_185) {
        this.poster_185 = poster_185;
    }

    public String getPoster_342() {
        return poster_342;
    }

    public void setPoster_342(String poster_342) {
        this.poster_342 = poster_342;
    }

    public String getPoster_500() {
        return poster_500;
    }

    public void setPoster_500(String poster_500) {
        this.poster_500 = poster_500;
    }

    public String getPoster_780() {
        return poster_780;
    }

    public void setPoster_780(String poster_780) {
        this.poster_780 = poster_780;
    }

    public String getPoster_92() {
        return poster_92;
    }

    public void setPoster_92(String poster_92) {
        this.poster_92 = poster_92;
    }

    public String getPoster_original() {
        return poster_original;
    }

    public void setPoster_original(String poster_original) {
        this.poster_original = poster_original;
    }

    public String getNetflixLink() {
        return netflixLink;
    }

    public void setNetflixLink(String netflixLink) {
        this.netflixLink = netflixLink;
    }

    public String getPrimeLink() {
        return primeLink;
    }

    public void setPrimeLink(String primeLink) {
        this.primeLink = primeLink;
    }

    public String getDisneyLink() {
        return disneyLink;
    }

    public void setDisneyLink(String disneyLink) {
        this.disneyLink = disneyLink;
    }

    public String getParamountLink() {
        return paramountLink;
    }

    public void setParamountLink(String paramountLink) {
        this.paramountLink = paramountLink;
    }

    public String getStarzLink() {
        return starzLink;
    }

    public void setStarzLink(String starzLink) {
        this.starzLink = starzLink;
    }

    public String getPeacockLink() {
        return peacockLink;
    }

    public void setPeacockLink(String peacockLink) {
        this.peacockLink = peacockLink;
    }

    public String getHuluLink() {
        return huluLink;
    }

    public void setHuluLink(String huluLink) {
        this.huluLink = huluLink;
    }

    public String getHboLink() {
        return hboLink;
    }

    public void setHboLink(String hboLink) {
        this.hboLink = hboLink;
    }

    public String getAppleLink() {
        return appleLink;
    }

    public void setAppleLink(String appleLink) {
        this.appleLink = appleLink;
    }

    public String getShowtimeLink() {
        return showtimeLink;
    }

    public void setShowtimeLink(String showtimeLink) {
        this.showtimeLink = showtimeLink;
    }

    public String getMubiLink() {
        return mubiLink;
    }

    public void setMubiLink(String mubiLink) {
        this.mubiLink = mubiLink;
    }

    public String getCuriosityLink() {
        return curiosityLink;
    }

    public void setCuriosityLink(String curiosityLink) {
        this.curiosityLink = curiosityLink;
    }

    public String getAll4Link() {
        return all4Link;
    }

    public void setAll4Link(String all4Link) {
        this.all4Link = all4Link;
    }

    public String getCraveLink() {
        return craveLink;
    }

    public void setCraveLink(String craveLink) {
        this.craveLink = craveLink;
    }

    public String getIplayerLink() {
        return iplayerLink;
    }

    public void setIplayerLink(String iplayerLink) {
        this.iplayerLink = iplayerLink;
    }

    public Set<MovieCastPair> getMovieCastPairList() {
        return movieCastPairList;
    }

    public void setMovieCastPairList(
        Set<MovieCastPair> movieCastPairList) {
        this.movieCastPairList = movieCastPairList;
    }

    public Set<MovieCountryPair> getMovieCountryPairList() {
        return movieCountryPairList;
    }

    public void setMovieCountryPairList(
        Set<MovieCountryPair> movieCountryPairList) {
        this.movieCountryPairList = movieCountryPairList;
    }

    public Set<MovieGenrePair> getMovieGenrePairList() {
        return movieGenrePairList;
    }

    public void setMovieGenrePairList(
        Set<MovieGenrePair> movieGenrePairList) {
        this.movieGenrePairList = movieGenrePairList;
    }

    public Set<CollectionList> getCollectionList() {
        return collectionList;
    }

    public void setCollectionList(Set<CollectionList> collectionList) {
        this.collectionList = collectionList;
    }

    @Override
    public String toString() {
        return "BasicMovieInfo{"
                + "imdbID='" + imdbID + '\''
                + ", originalTitle='" + originalTitle + '\''
                + ", language='" + language + '\''
                + ", year=" + year
                + ", overview='" + overview + '\''
                + ", imdbRating=" + imdbRating
                + ", backdrop_1280='" + backdrop_1280 + '\''
                + ", backdrop_300='" + backdrop_300 + '\''
                + ", backdrop_780='" + backdrop_780 + '\''
                + ", backdrop_original='" + backdrop_original + '\''
                + ", poster_154='" + poster_154 + '\''
                + ", poster_185='" + poster_185 + '\''
                + ", poster_342='" + poster_342 + '\''
                + ", poster_500='" + poster_500 + '\''
                + ", poster_780='" + poster_780 + '\''
                + ", poster_92='" + poster_92 + '\''
                + ", poster_original='" + poster_original + '\''
                + ", netflixLink='" + netflixLink + '\''
                + ", primeLink='" + primeLink + '\''
                + ", disneyLink='" + disneyLink + '\''
                + ", paramountLink='" + paramountLink + '\''
                + ", starzLink='" + starzLink + '\''
                + ", peacockLink='" + peacockLink + '\''
                + ", huluLink='" + huluLink + '\''
                + ", hboLink='" + hboLink + '\''
                + ", appleLink='" + appleLink + '\''
                + ", showtimeLink='" + showtimeLink + '\''
                + ", mubiLink='" + mubiLink + '\''
                + ", curiosityLink='" + curiosityLink + '\''
                + ", all4Link='" + all4Link + '\''
                + ", craveLink='" + craveLink + '\''
                + ", iPlayerLink='" + iplayerLink + '\''
                + '}';
    }
}
