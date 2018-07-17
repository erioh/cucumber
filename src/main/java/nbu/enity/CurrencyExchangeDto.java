package nbu.enity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.Objects;

public class CurrencyExchangeDto {
    private String r030;
    private String txt;
    private Double rate;
    private String cc;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Date exchangedate;


    public String getR030() {
        return r030;
    }

    public void setR030(String r030) {
        this.r030 = r030;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public Date getExchangedate() {
        return exchangedate;
    }

    public void setExchangedate(Date exchangedate) {
        this.exchangedate = exchangedate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrencyExchangeDto that = (CurrencyExchangeDto) o;
        return Objects.equals(r030, that.r030) &&
                Objects.equals(txt, that.txt) &&
                Objects.equals(rate, that.rate) &&
                Objects.equals(cc, that.cc) &&
                Objects.equals(exchangedate, that.exchangedate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(r030, txt, rate, cc, exchangedate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CurrencyExchangeDto{");
        sb.append("r030='").append(r030).append('\'');
        sb.append(", txt='").append(txt).append('\'');
        sb.append(", rate=").append(rate);
        sb.append(", cc='").append(cc).append('\'');
        sb.append(", exchangedate=").append(exchangedate);
        sb.append('}');
        return sb.toString();
    }
}
