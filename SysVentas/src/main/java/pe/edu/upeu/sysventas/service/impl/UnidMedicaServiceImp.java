package pe.edu.upeu.sysventas.service.impl;

import lombok.RequiredArgsConstructor;
import pe.edu.upeu.sysventas.model.UnidMedida;
import pe.edu.upeu.sysventas.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysventas.repository.UnidMedidaRepository;
import pe.edu.upeu.sysventas.service.IUnidMedidaService;
@RequiredArgsConstructor
public class UnidMedicaServiceImp extends CrudGenericoServiceImp<UnidMedida,Long> implements IUnidMedidaService {
    private final UnidMedidaRepository unidMedidaRepository;
    @Override

    protected ICrudGenericoRepository<UnidMedida, Long> getRepo() {
        return unidMedidaRepository;
    }




}
