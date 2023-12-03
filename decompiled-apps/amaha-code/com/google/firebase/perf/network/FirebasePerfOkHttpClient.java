package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import ef.d;
import gf.g;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import kf.i;
import lv.c0;
import lv.d0;
import lv.e;
import lv.e0;
import lv.f;
import lv.t;
import lv.v;
import lv.z;
import ta.q6;
/* loaded from: classes.dex */
public class FirebasePerfOkHttpClient {
    public static void a(d0 d0Var, d dVar, long j10, long j11) {
        z zVar = d0Var.f24583u;
        if (zVar == null) {
            return;
        }
        t tVar = zVar.f24751a;
        tVar.getClass();
        try {
            dVar.k(new URL(tVar.f24693i).toString());
            dVar.d(zVar.f24752b);
            c0 c0Var = zVar.f24754d;
            if (c0Var != null) {
                long a10 = c0Var.a();
                if (a10 != -1) {
                    dVar.f(a10);
                }
            }
            e0 e0Var = d0Var.A;
            if (e0Var != null) {
                long a11 = e0Var.a();
                if (a11 != -1) {
                    dVar.i(a11);
                }
                v e10 = e0Var.e();
                if (e10 != null) {
                    dVar.h(e10.f24704a);
                }
            }
            dVar.e(d0Var.f24586x);
            dVar.g(j10);
            dVar.j(j11);
            dVar.b();
        } catch (MalformedURLException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Keep
    public static void enqueue(e eVar, f fVar) {
        i iVar = new i();
        eVar.O(new q6(fVar, jf.e.M, iVar, iVar.f23322u));
    }

    @Keep
    public static d0 execute(e eVar) {
        d dVar = new d(jf.e.M);
        i iVar = new i();
        long j10 = iVar.f23322u;
        try {
            d0 g5 = eVar.g();
            a(g5, dVar, j10, iVar.a());
            return g5;
        } catch (IOException e10) {
            z s10 = eVar.s();
            if (s10 != null) {
                t tVar = s10.f24751a;
                if (tVar != null) {
                    try {
                        dVar.k(new URL(tVar.f24693i).toString());
                    } catch (MalformedURLException e11) {
                        throw new RuntimeException(e11);
                    }
                }
                String str = s10.f24752b;
                if (str != null) {
                    dVar.d(str);
                }
            }
            dVar.g(j10);
            dVar.j(iVar.a());
            g.c(dVar);
            throw e10;
        }
    }
}
