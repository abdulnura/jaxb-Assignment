package movie;

import java.math.BigDecimal;
import java.net.URL;
import java.time.Year;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"title", "year", "rating", "votes", "genres"})
@Getter
@Setter
@ToString
public class Movie {

    private String title;
    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    private BigDecimal rating;
    private int votes;

    @XmlElementWrapper(name = "genres")
    @XmlElement(name = "genre")
    private List<String> genres;

    @XmlAttribute
    private URL url;

}