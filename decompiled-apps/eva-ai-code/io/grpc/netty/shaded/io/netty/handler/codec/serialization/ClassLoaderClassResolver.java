package io.grpc.netty.shaded.io.netty.handler.codec.serialization;
/* loaded from: classes4.dex */
class ClassLoaderClassResolver implements ClassResolver {
    private final ClassLoader classLoader;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ClassLoaderClassResolver(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.serialization.ClassResolver
    public Class<?> resolve(String str) throws ClassNotFoundException {
        try {
            return this.classLoader.loadClass(str);
        } catch (ClassNotFoundException unused) {
            return Class.forName(str, false, this.classLoader);
        }
    }
}
