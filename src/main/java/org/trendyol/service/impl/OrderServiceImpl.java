package org.trendyol.service.impl;

import com.google.gson.Gson;
import org.trendyol.config.Endpoints;
import org.trendyol.dto.BaseResponseDto;
import org.trendyol.dto.order.OrderDto;
import org.trendyol.service.OrderService;

public class OrderServiceImpl extends BaseService implements OrderService {

    @Override
    public OrderDto getOrderList(String... params) {
        String paramString = getParamString(params);
        String url = this.getUrlWithSupplier(Endpoints.orders + "?" + paramString);

        BaseResponseDto serviceResponse = this.request("GET", url, null);
        return new Gson().fromJson(serviceResponse.getResponse(), OrderDto.class);
    }

    public String getParamString(String... params) {
        if (params.length == 0 || params.length % 2 != 0) return null;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < params.length; i += 2) {
            String name = params[i];
            String value = params[i + 1];
            sb.append(name).append("=").append(value).append("&");
        }

        return sb.toString();
    }
}
