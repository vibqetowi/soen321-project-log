package p002if;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import df.a;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kf.i;
import lf.e;
/* compiled from: CpuGaugeCollector.java */
/* renamed from: if.b  reason: invalid package */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: g  reason: collision with root package name */
    public static final a f20007g = a.d();

    /* renamed from: h  reason: collision with root package name */
    public static final long f20008h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: c  reason: collision with root package name */
    public final String f20011c;

    /* renamed from: d  reason: collision with root package name */
    public final long f20012d;

    /* renamed from: e  reason: collision with root package name */
    public ScheduledFuture f20013e = null;
    public long f = -1;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentLinkedQueue<e> f20009a = new ConcurrentLinkedQueue<>();

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f20010b = Executors.newSingleThreadScheduledExecutor();

    public b() {
        int myPid = Process.myPid();
        this.f20011c = "/proc/" + Integer.toString(myPid) + "/stat";
        this.f20012d = Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public final synchronized void a(long j10, i iVar) {
        this.f = j10;
        try {
            this.f20013e = this.f20010b.scheduleAtFixedRate(new a(this, iVar, 0), 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            a aVar = f20007g;
            aVar.f("Unable to start collecting Cpu Metrics: " + e10.getMessage());
        }
    }

    /* JADX WARN: Not initialized variable reg: 15, insn: 0x00a4: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:29:0x00a4 */
    public final e b(i iVar) {
        a aVar;
        a aVar2;
        long parseLong;
        long parseLong2;
        e.a P;
        double d10;
        long j10;
        long j11 = this.f20012d;
        a aVar3 = f20007g;
        if (iVar == null) {
            return null;
        }
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f20011c));
                try {
                    long a10 = iVar.a() + iVar.f23322u;
                    String[] split = bufferedReader.readLine().split(" ");
                    parseLong = Long.parseLong(split[13]);
                    parseLong2 = Long.parseLong(split[15]);
                    long parseLong3 = Long.parseLong(split[14]);
                    long parseLong4 = Long.parseLong(split[16]);
                    P = e.P();
                    P.u();
                    e.M((e) P.f10073v, a10);
                    d10 = (parseLong3 + parseLong4) / j11;
                    j10 = f20008h;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    long round = Math.round(d10 * j10);
                    P.u();
                    e.O((e) P.f10073v, round);
                    long round2 = Math.round(((parseLong + parseLong2) / j11) * j10);
                    P.u();
                    e.N((e) P.f10073v, round2);
                    e r = P.r();
                    bufferedReader.close();
                    return r;
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    try {
                        bufferedReader.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (IOException e10) {
                e = e10;
                aVar = aVar2;
                aVar.f("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
                return null;
            } catch (ArrayIndexOutOfBoundsException e11) {
                e = e11;
                aVar3.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
                return null;
            } catch (NullPointerException e12) {
                e = e12;
                aVar3.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
                return null;
            } catch (NumberFormatException e13) {
                e = e13;
                aVar3.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
                return null;
            }
        } catch (IOException e14) {
            e = e14;
            aVar = aVar3;
            aVar.f("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e15) {
            e = e15;
            aVar3.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e16) {
            e = e16;
            aVar3.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e17) {
            e = e17;
            aVar3.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }
}
