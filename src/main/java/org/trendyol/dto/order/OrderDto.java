package org.trendyol.dto.order;

import java.util.List;

public class OrderDto {
    private int page;
    private int size;
    private int totalPages;
    private int totalElements;
    private List<OrderContentDto> content;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public List<OrderContentDto> getContent() {
        return content;
    }

    public void setContent(List<OrderContentDto> content) {
        this.content = content;
    }
}
