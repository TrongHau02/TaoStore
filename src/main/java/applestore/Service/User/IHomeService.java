package applestore.Service.User;

import applestore.Entity.Slides;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IHomeService {
    @Autowired
    public List<Slides> getDataSlide();
}
