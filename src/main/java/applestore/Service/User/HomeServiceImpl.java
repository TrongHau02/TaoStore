package applestore.Service.User;

import applestore.Dao.SlidesDao;
import applestore.Entity.Slides;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeServiceImpl implements IHomeService {
    @Autowired
    private SlidesDao slidesDao;

    @Override
    public List<Slides> getDataSlide() {
        return slidesDao.GetDataSlides();
    }
}
