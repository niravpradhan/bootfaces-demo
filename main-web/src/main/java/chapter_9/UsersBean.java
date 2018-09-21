package chapter_9;

import me.niravpradhan.jsf.utils.AbstractPaginationBean;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.util.List;

@Named
@ViewScoped
public class UsersBean extends AbstractPaginationBean<User> {

    private List<User> list;

    @Override
    public void setList(List<User> list) {
        this.list = list;
    }

    @Override
    public List<User> getList() {
        return list;
    }

    @Override
    public List<User> getSubList(int startIndex, int endIndex) {
        return Repository.getSubList(startIndex, endIndex);
    }

    @PostConstruct
    public void init() {
        setCount(Repository.count());
        setNoOfRows(5);
        setStartIndex(0);
        setEndIndex(getNoOfRows());

        calculatePages();

        list = getSubList(getStartIndex(), getEndIndex());
    }

}
