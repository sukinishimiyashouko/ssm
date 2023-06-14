package com.wbu.ssm.mvc.bean;

/**
 * @auther aqing
 */

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class Fit {
    private int fit_id;
    private String fit_no;
    private String fit_name;
    private int fit_qty;
    private String fit_city;

    public Fit() {
    }

    public Fit(int fit_id, String fit_no, String fit_name, int fit_qty, String fit_city) {
        this.fit_id = fit_id;
        this.fit_no = fit_no;
        this.fit_name = fit_name;
        this.fit_qty = fit_qty;
        this.fit_city = fit_city;
    }

    @Override
    public String toString() {
        return "Fit{" +
                "fit_id=" + fit_id +
                ", fit_no='" + fit_no + '\'' +
                ", fit_name='" + fit_name + '\'' +
                ", fit_qty=" + fit_qty +
                ", fit_city='" + fit_city + '\'' +
                '}';
    }
}
