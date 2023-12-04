package io.grpc.netty.shaded.io.netty.buffer;
/* loaded from: classes4.dex */
public interface SizeClassesMetric {
    int normalizeSize(int i);

    long pageIdx2size(int i);

    long pageIdx2sizeCompute(int i);

    int pages2pageIdx(int i);

    int pages2pageIdxFloor(int i);

    int size2SizeIdx(int i);

    int sizeIdx2size(int i);

    int sizeIdx2sizeCompute(int i);
}
