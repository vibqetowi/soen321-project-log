package g;
/* compiled from: TwilightCalculator.java */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: d  reason: collision with root package name */
    public static a0 f16002d;

    /* renamed from: a  reason: collision with root package name */
    public long f16003a;

    /* renamed from: b  reason: collision with root package name */
    public long f16004b;

    /* renamed from: c  reason: collision with root package name */
    public int f16005c;

    public final void a(long j10, double d10, double d11) {
        float f;
        float f2;
        double d12;
        double d13 = (0.01720197f * (((float) (j10 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(f2 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f2) * 3.4906598739326E-4d) + (Math.sin(d13) * 0.03341960161924362d) + d13 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d13) * 0.0053d) + ((float) Math.round((f - 9.0E-4f) - d12)) + 9.0E-4f + ((-d11) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d14 = 0.01745329238474369d * d10;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d14))) / (Math.cos(asin) * Math.cos(d14));
        if (sin3 >= 1.0d) {
            this.f16005c = 1;
            this.f16003a = -1L;
            this.f16004b = -1L;
        } else if (sin3 <= -1.0d) {
            this.f16005c = 0;
            this.f16003a = -1L;
            this.f16004b = -1L;
        } else {
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f16003a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f16004b = round;
            if (round < j10 && this.f16003a > j10) {
                this.f16005c = 0;
            } else {
                this.f16005c = 1;
            }
        }
    }
}
