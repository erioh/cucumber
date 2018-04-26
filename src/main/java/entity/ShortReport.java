package entity;

import java.util.Objects;

public class ShortReport {
    private String category;
    private String summary;

    public ShortReport() {

    }

    public ShortReport(Report report) {
        this.category = report.getCategory();
        this.summary = report.getSummary();
    }

    public String getCategory() {
        return category;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShortReport that = (ShortReport) o;
        return Objects.equals(category, that.category) &&
                Objects.equals(summary, that.summary);
    }

    @Override
    public int hashCode() {

        return Objects.hash(category, summary);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ShortReport{");
        sb.append("category='").append(category).append('\'');
        sb.append(", summary='").append(summary).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
