package androidx.camera.extensions.internal;

import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class Version implements Comparable<Version> {
    public static final Version VERSION_1_0 = create(1, 0, 0, "");
    public static final Version VERSION_1_1 = create(1, 1, 0, "");
    public static final Version VERSION_1_2 = create(1, 2, 0, "");
    private static final Pattern VERSION_STRING_PATTERN = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");

    abstract String getDescription();

    public abstract int getMajor();

    abstract int getMinor();

    abstract int getPatch();

    public static Version parse(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = VERSION_STRING_PATTERN.matcher(str);
        if (matcher.matches()) {
            return create(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), matcher.group(4) != null ? matcher.group(4) : "");
        }
        return null;
    }

    public static Version create(int i, int i2, int i3, String str) {
        return new AutoValue_Version(i, i2, i3, str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(getMajor() + "." + getMinor() + "." + getPatch());
        if (!TextUtils.isEmpty(getDescription())) {
            sb.append("-" + getDescription());
        }
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(Version version) {
        return createBigInteger(this).compareTo(createBigInteger(version));
    }

    public int compareTo(int i) {
        return compareTo(i, 0);
    }

    public int compareTo(int i, int i2) {
        if (getMajor() == i) {
            return Integer.compare(getMinor(), i2);
        }
        return Integer.compare(getMajor(), i);
    }

    private static BigInteger createBigInteger(Version version) {
        return BigInteger.valueOf(version.getMajor()).shiftLeft(32).or(BigInteger.valueOf(version.getMinor())).shiftLeft(32).or(BigInteger.valueOf(version.getPatch()));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Version) {
            Version version = (Version) obj;
            return Objects.equals(Integer.valueOf(getMajor()), Integer.valueOf(version.getMajor())) && Objects.equals(Integer.valueOf(getMinor()), Integer.valueOf(version.getMinor())) && Objects.equals(Integer.valueOf(getPatch()), Integer.valueOf(version.getPatch()));
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(getMajor()), Integer.valueOf(getMinor()), Integer.valueOf(getPatch()));
    }
}
