package InterfaceWithFunction;
@FunctionalInterface
interface BiFunctional<T, U, R> {
    R func(T t, U u) ;
}
