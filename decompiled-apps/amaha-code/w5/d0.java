package w5;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.regex.Pattern;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f36451a;

    public /* synthetic */ d0(int i6) {
        this.f36451a = i6;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String name) {
        switch (this.f36451a) {
            case 0:
                return Pattern.matches("cpu[0-9]+", name);
            case 1:
                kotlin.jvm.internal.i.f(name, "name");
                String format = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
                kotlin.jvm.internal.i.f(format, "java.lang.String.format(format, *args)");
                Pattern compile = Pattern.compile(format);
                kotlin.jvm.internal.i.f(compile, "compile(pattern)");
                return compile.matcher(name).matches();
            case 2:
                kotlin.jvm.internal.i.f(name, "name");
                String format2 = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
                kotlin.jvm.internal.i.f(format2, "java.lang.String.format(format, *args)");
                Pattern compile2 = Pattern.compile(format2);
                kotlin.jvm.internal.i.f(compile2, "compile(pattern)");
                return compile2.matcher(name).matches();
            case 3:
                kotlin.jvm.internal.i.f(name, "name");
                String format3 = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
                kotlin.jvm.internal.i.f(format3, "java.lang.String.format(format, *args)");
                Pattern compile3 = Pattern.compile(format3);
                kotlin.jvm.internal.i.f(compile3, "compile(pattern)");
                return compile3.matcher(name).matches();
            case 4:
                kotlin.jvm.internal.i.f(name, "name");
                String format4 = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
                kotlin.jvm.internal.i.f(format4, "java.lang.String.format(format, *args)");
                Pattern compile4 = Pattern.compile(format4);
                kotlin.jvm.internal.i.f(compile4, "compile(pattern)");
                return compile4.matcher(name).matches();
            case 5:
                return name.startsWith(".ae");
            case 6:
                Charset charset = sd.a.f31452d;
                if (name.startsWith("event") && !name.endsWith("_")) {
                    return true;
                }
                return false;
            default:
                Charset charset2 = sd.a.f31452d;
                return name.startsWith("event");
        }
    }
}
