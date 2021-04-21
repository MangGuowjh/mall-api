package top.dl.mall.api.controller.vo;
import top.dl.mall.api.entity.MallGoodsCategory;
import lombok.Data;
import java.io.Serializable;
import java.util.List;
/**
 *  @description: 搜索页面分类VO
 * @author Denglin
 */
@Data
public class SearchPageCategoryVO implements Serializable {
    private String firstLevelCategoryName;
    private List<MallGoodsCategory> secondLevelCategoryList;
    private String secondLevelCategoryName;
    private List<MallGoodsCategory> thirdLevelCategoryList;
    private String currentCategoryName;
}
