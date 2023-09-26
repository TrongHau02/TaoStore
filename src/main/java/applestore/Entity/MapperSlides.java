package applestore.Entity;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapperSlides implements RowMapper<Slides> {
    @Override
    public Slides mapRow(ResultSet rs, int rowNum) throws SQLException {
        Slides slides = new Slides();
        slides.setSlideID(rs.getInt("slideID"));
        slides.setSlideName(rs.getString("slideName"));
        slides.setImage(rs.getString("image"));
        slides.setDescription(rs.getString("description"));
        return slides;
    }
}
