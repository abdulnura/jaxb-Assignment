package legoset;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import movie.YearAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.Year;
import java.util.List;
import java.util.Set;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
@EqualsAndHashCode
public class LegoSet {
    @XmlAttribute
    private String number;
    private String name;
    private String theme;
    private String subtheme;

    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    private int pieces;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private Set<String> tags;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private List<Minifig> minifigs;
    private Weight weight;
    private String url;

    public LegoSet() {
    }

    public void setSubtheme(String subtheme) {
        this.subtheme = subtheme;
    }

    public String getSubtheme() {
        return subtheme;
    }

    public void setTheme(String star_wars) {
    }

    public void setName(String imperial_tie_fighter) {
    }

    public void setNumber(String s) {
    }

    public void setYear(Year of) {
    }

    public void setPieces(int i) {
    }

    public void setTags(Set<String> tags) {
    }

    public void setMinifigs(List<Minifig> minifigs) {
    }

    public void setUrl(String s) {
    }

    public void setWeight(Weight kg) {
    }
}
