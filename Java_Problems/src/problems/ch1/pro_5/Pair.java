package problems.ch1.pro_5;

public class Pair<V, C> {

	private V vowel;
	private C consonant;

	public Pair() {
		super();
	}

	public Pair(V vowel, C consonant) {
		super();
		this.vowel = vowel;
		this.consonant = consonant;
	}

	static <V, C> Pair<V, C> of(V vowel, C consonant) {
		return new Pair<>(vowel, consonant);
	}

	@Override
	public int hashCode() {
		return vowel.hashCode() ^ consonant.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Pair)) {
			return false;
		}

		Pair pair = (Pair) obj;
		return this.vowel.equals(pair.vowel) && this.consonant.equals(pair.consonant);
	}

	@Override
	public String toString() {
		return "Pair [vowel=" + vowel + ", consonant=" + consonant + "]";
	}
}
