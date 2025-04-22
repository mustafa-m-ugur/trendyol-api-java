package org.trendyol.client;

import org.trendyol.config.Credentials;
import org.trendyol.dto.BaseResponseDto;

import java.io.IOException;

public interface TrendyolClient {

    BaseResponseDto execute(Credentials credentials, String method, String url, String requestData) throws IOException, InterruptedException;
}
