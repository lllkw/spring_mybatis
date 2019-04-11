package com.lkw.tools;

public class Page {
    int currentPage = 1;
    int pageCount;
    int pageSize = 3;
    int totalCount;
    int start;

    public int getStart() {
        this.start = (currentPage-1)*pageSize;
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "Page{" +
                "currentPage=" + currentPage +
                ", pageCount=" + pageCount +
                ", pageSize=" + pageSize +
                ", totalCount=" + totalCount +
                '}';
    }
}
