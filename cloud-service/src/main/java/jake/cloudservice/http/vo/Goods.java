package jake.cloudservice.http.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;

/**
 * Created by Jake.lin on 2020/08/03
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Goods {
    private Integer id;
    private String name;
    private String description;
    @JsonProperty("create_time")
    private LocalDateTime createTime;
    /**
     * 单位：分
     */
    private Integer price;

    public Goods(Integer id, String name, String description, LocalDateTime createTime, Integer price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createTime = createTime;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
