package dtos;

public class DadDto {
    private String joke;
    private String reference;

    public DadDto(String joke) {
        this.joke = joke;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "DadDto{" +
                "joke='" + joke + '\'' +
                ", reference='" + reference + '\'' +
                '}';
    }
}
