package ar.edu.unahur.obj2;

public abstract class TipoHabilidad implements IHabilidad {
  protected IProfugo profugo;

  public TipoHabilidad(IProfugo profugo) {
    this.profugo = profugo;
  }

  @Override
  public void entrenar() {
    profugo.entrenar();
    doEntrenar();
  }

  protected abstract void doEntrenar();
}
