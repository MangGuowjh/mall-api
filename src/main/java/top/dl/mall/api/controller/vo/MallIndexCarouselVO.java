package top.dl.mall.api.controller.vo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 首页轮播图VO类
 * @author Denglin
 */
@Data
public class MallIndexCarouselVO {
    @ApiModelProperty("轮播图图片地址")
    private String carouselUrl;
    @ApiModelProperty("轮播图点击后的跳转路径")
    private String redirectUrl;
}
