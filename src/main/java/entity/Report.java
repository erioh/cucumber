package entity;

import java.util.Objects;

public class Report {
    private String category = "";
    private String summary = "";
    private String description = "";

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Report{");
        sb.append("category='").append(category).append('\'');
        sb.append(", summary='").append(summary).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Report report = (Report) o;
        return Objects.equals(category, report.category) &&
                Objects.equals(summary, report.summary) &&
                Objects.equals(description, report.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(category, summary, description);
    }
}
