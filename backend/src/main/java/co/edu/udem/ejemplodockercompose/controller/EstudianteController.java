package co.edu.udem.ejemplodockercompose.controller;

import co.edu.udem.ejemplodockercompose.model.Estudiante;
import co.edu.udem.ejemplodockercompose.service.EstudianteService;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api")
public class EstudianteController {
    private final EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @GetMapping("/saludo")
    @Operation(summary = "Es un backend muy saludable")
    public String holaMundo(){
        return "Hola Mundo";
    }

    @GetMapping("/estudiantes")
    @Operation(summary = "Metodo Get Trae lista de estudiantes")
    public List<Estudiante> getEstudiantes(){
        return estudianteService.findAll();
    }

    @PostMapping("/estudiantes")
    @Operation(summary = "Metodo Post permite guardar nuevos estudiantes")
    public Estudiante createEstudiante(@RequestBody Estudiante estudiante) {
        return estudianteService.create(estudiante);
    }

    @PutMapping("/update")
    @Operation(summary = "Metodo Put para modificar estudiantes")
    public Estudiante updateEstudiante(@RequestBody Estudiante estudiante){
        return estudianteService.update(estudiante);
    }
}
