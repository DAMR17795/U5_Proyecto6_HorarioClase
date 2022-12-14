package www.iesmurgi.u5_proyecto6_horarioclase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import www.iesmurgi.u5_proyecto6_horarioclase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    var horasAD = 0
    var horasPMDM =0
    var horasEIE=0
    var horasSGE =0
    var horasPSP=0
    var horasDI=0
    fun metodoClick (view: View) {
        if (view is CheckBox) {
            val checked=view.isChecked
            var textoDatos = binding.accesDatostxt
            var textoPMDM = binding.txtpmdm
            var textoDI = binding.txtDI
            var textoSGE = binding.txtSGE
            var textoPSP = binding.txtPSP
            var textoEIE = binding.txtEIE
            when (view.id) {
                //Acceso a datos - AD
                 binding.chBoxAD1.id ->
                    if (checked) {
                        horasAD +=1
                        textoDatos.setText("Acceso a Datos: " + horasAD)
                    } else if (!checked && !binding.chBoxAD2.isChecked && !binding.chBoxAD3.isChecked && !binding.chBoxAD4.isChecked &&
                            !binding.chBoxAD5.isChecked) {
                        textoDatos.setText("")
                        horasAD=0
                    } else if (!checked) {
                        horasAD += -1
                        textoDatos.setText("Acceso a Datos: " + horasAD)
                    }
                binding.chBoxAD2.id ->
                    if (checked) {
                        horasAD += 1
                        textoDatos.setText("Acceso a Datos: " + horasAD)
                    } else if (!checked && !binding.chBoxAD1.isChecked && !binding.chBoxAD3.isChecked && !binding.chBoxAD4.isChecked &&
                        !binding.chBoxAD5.isChecked) {
                        textoDatos.setText("")
                        horasAD=0
                    } else if (!checked) {
                        horasAD += -1
                        textoDatos.setText("Acceso a Datos: " + horasAD)
                    }
                binding.chBoxAD3.id ->
                    if (checked) {
                        horasAD +=1
                        textoDatos.setText("Acceso a Datos: " + horasAD)
                    } else if (!checked && !binding.chBoxAD1.isChecked && !binding.chBoxAD2.isChecked && !binding.chBoxAD4.isChecked &&
                        !binding.chBoxAD5.isChecked) {
                        textoDatos.setText("")
                        horasAD=0
                    } else if (!checked) {
                        horasAD += -1
                        textoDatos.setText("Acceso a Datos: " + horasAD)
                    }
                binding.chBoxAD4.id ->
                    if (checked) {
                        horasAD +=1
                        textoDatos.setText("Acceso a Datos: " + horasAD)
                    } else if (!checked && !binding.chBoxAD1.isChecked && !binding.chBoxAD2.isChecked && !binding.chBoxAD3.isChecked &&
                        !binding.chBoxAD5.isChecked) {
                        textoDatos.setText("")
                        horasAD=0
                    } else if (!checked) {
                        horasAD += -1
                        textoDatos.setText("Acceso a Datos: " + horasAD)
                    }
                binding.chBoxAD5.id ->
                    if (checked) {
                        horasAD +=1
                        textoDatos.setText("Acceso a Datos: " + horasAD)
                    } else if (!checked && !binding.chBoxAD1.isChecked && !binding.chBoxAD2.isChecked && !binding.chBoxAD3.isChecked &&
                        !binding.chBoxAD4.isChecked) {
                        textoDatos.setText("")
                        horasAD=0
                    } else if (!checked) {
                        horasAD += -1
                        textoDatos.setText("Acceso a Datos: " + horasAD)
                    }

                //Programacion multimedia - PMDM
                binding.chBoxPMDM1.id ->
                    if (checked) {
                        horasPMDM +=1
                        textoPMDM.setText("Programaci??n Multimedia y Dispositivos M??viles: " + horasPMDM)
                    } else if (!checked && !binding.chBoxPMDM2.isChecked && !binding.chBoxPMDM3.isChecked && !binding.chBoxPMDM4.isChecked &&
                        !binding.chBoxPMDM5.isChecked && !binding.chBoxPMDM6.isChecked && !binding.chBoxPMDM7.isChecked) {
                        textoPMDM.setText("")
                        horasPMDM=0
                    } else if (!checked) {
                        horasPMDM += -1
                        textoPMDM.setText("Programaci??n Multimedia y Dispositivos M??viles: " + horasPMDM)
                    }
                binding.chBoxPMDM2.id ->
                    if (checked) {
                        horasPMDM +=1
                        textoPMDM.setText("Programaci??n Multimedia y Dispositivos M??viles: " + horasPMDM)
                    } else if (!checked && !binding.chBoxPMDM1.isChecked && !binding.chBoxPMDM3.isChecked && !binding.chBoxPMDM4.isChecked &&
                        !binding.chBoxPMDM5.isChecked && !binding.chBoxPMDM6.isChecked && !binding.chBoxPMDM7.isChecked) {
                        textoPMDM.setText("")
                        horasPMDM=0
                    } else if (!checked) {
                        horasPMDM += -1
                        textoPMDM.setText("Programaci??n Multimedia y Dispositivos M??viles: " + horasPMDM)
                    }
                binding.chBoxPMDM3.id ->
                    if (checked) {
                        horasPMDM +=1
                        textoPMDM.setText("Programaci??n Multimedia y Dispositivos M??viles: " + horasPMDM)
                    } else if (!checked && !binding.chBoxPMDM2.isChecked && !binding.chBoxPMDM1.isChecked && !binding.chBoxPMDM4.isChecked &&
                        !binding.chBoxPMDM5.isChecked && !binding.chBoxPMDM6.isChecked && !binding.chBoxPMDM7.isChecked) {
                        textoPMDM.setText("")
                        horasPMDM=0
                    } else if (!checked) {
                        horasPMDM += -1
                        textoPMDM.setText("Programaci??n Multimedia y Dispositivos M??viles: " + horasPMDM)
                    }
                binding.chBoxPMDM4.id ->
                    if (checked) {
                        horasPMDM +=1
                        textoPMDM.setText("Programaci??n Multimedia y Dispositivos M??viles: " + horasPMDM)
                    } else if (!checked && !binding.chBoxPMDM2.isChecked && !binding.chBoxPMDM3.isChecked && !binding.chBoxPMDM1.isChecked &&
                        !binding.chBoxPMDM5.isChecked && !binding.chBoxPMDM6.isChecked && !binding.chBoxPMDM7.isChecked) {
                        textoPMDM.setText("")
                        horasPMDM=0
                    } else if (!checked) {
                        horasPMDM += -1
                        textoPMDM.setText("Programaci??n Multimedia y Dispositivos M??viles: " + horasPMDM)
                    }
                binding.chBoxPMDM5.id ->
                    if (checked) {
                        horasPMDM +=1
                        textoPMDM.setText("Programaci??n Multimedia y Dispositivos M??viles: " + horasPMDM)
                    } else if (!checked && !binding.chBoxPMDM2.isChecked && !binding.chBoxPMDM3.isChecked && !binding.chBoxPMDM4.isChecked &&
                        !binding.chBoxPMDM1.isChecked && !binding.chBoxPMDM6.isChecked && !binding.chBoxPMDM7.isChecked) {
                        textoPMDM.setText("")
                        horasPMDM=0
                    } else if (!checked) {
                        horasPMDM += -1
                        textoPMDM.setText("Programaci??n Multimedia y Dispositivos M??viles: " + horasPMDM)
                    }
                binding.chBoxPMDM6.id ->
                    if (checked) {
                        horasPMDM +=1
                        textoPMDM.setText("Programaci??n Multimedia y Dispositivos M??viles: " + horasPMDM)
                    } else if (!checked && !binding.chBoxPMDM2.isChecked && !binding.chBoxPMDM3.isChecked && !binding.chBoxPMDM4.isChecked &&
                        !binding.chBoxPMDM5.isChecked && !binding.chBoxPMDM1.isChecked && !binding.chBoxPMDM7.isChecked) {
                        textoPMDM.setText("")
                        horasPMDM=0
                    } else if (!checked) {
                        horasPMDM += -1
                        textoPMDM.setText("Programaci??n Multimedia y Dispositivos M??viles: " + horasPMDM)
                    }
                binding.chBoxPMDM7.id ->
                    if (checked) {
                        horasPMDM +=1
                        textoPMDM.setText("Programaci??n Multimedia y Dispositivos M??viles: " + horasPMDM)
                    } else if (!checked && !binding.chBoxPMDM2.isChecked && !binding.chBoxPMDM3.isChecked && !binding.chBoxPMDM4.isChecked &&
                        !binding.chBoxPMDM5.isChecked && !binding.chBoxPMDM6.isChecked && !binding.chBoxPMDM1.isChecked) {
                        textoPMDM.setText("")
                        horasPMDM=0
                    } else if (!checked) {
                        horasPMDM += -1
                        textoPMDM.setText("Programaci??n Multimedia y Dispositivos M??viles: " + horasPMDM)
                    }
                //Desarrollo de Interfaces - DI
                binding.chBoxDI1.id ->
                    if (checked) {
                        horasDI +=1
                        textoDI.setText("Desarrollo de Interfaces: " + horasDI)
                    } else if (!checked && !binding.chBoxDI2.isChecked && !binding.chBoxDI3.isChecked && !binding.chBoxDI4.isChecked &&
                        !binding.chBoxDI5.isChecked && !binding.chBoxDI6.isChecked && !binding.chBoxDI7.isChecked) {
                        textoDI.setText("")
                        horasDI=0
                    } else if (!checked) {
                        horasDI += -1
                        textoDI.setText("Desarrollo de Interfaces: " + horasDI)
                    }
                binding.chBoxDI2.id ->
                    if (checked) {
                        horasDI +=1
                        textoDI.setText("Desarrollo de Interfaces: " + horasDI)
                    } else if (!checked && !binding.chBoxDI1.isChecked && !binding.chBoxDI3.isChecked && !binding.chBoxDI4.isChecked &&
                        !binding.chBoxDI5.isChecked && !binding.chBoxDI6.isChecked && !binding.chBoxDI7.isChecked) {
                        textoDI.setText("")
                        horasDI=0
                    } else if (!checked) {
                        horasDI += -1
                        textoDI.setText("Desarrollo de Interfaces: " + horasDI)
                    }
                binding.chBoxDI3.id ->
                    if (checked) {
                        horasDI +=1
                        textoDI.setText("Desarrollo de Interfaces: " + horasDI)
                    } else if (!checked && !binding.chBoxDI1.isChecked && !binding.chBoxDI1.isChecked && !binding.chBoxDI4.isChecked &&
                        !binding.chBoxDI5.isChecked && !binding.chBoxDI6.isChecked && !binding.chBoxDI7.isChecked) {
                        textoDI.setText("")
                        horasDI=0
                    } else if (!checked) {
                        horasDI += -1
                        textoDI.setText("Desarrollo de Interfaces: " + horasDI)
                    }
                binding.chBoxDI4.id ->
                    if (checked) {
                        horasDI +=1
                        textoDI.setText("Desarrollo de Interfaces: " + horasDI)
                    } else if (!checked && !binding.chBoxDI1.isChecked && !binding.chBoxDI3.isChecked && !binding.chBoxDI1.isChecked &&
                        !binding.chBoxDI5.isChecked && !binding.chBoxDI6.isChecked && !binding.chBoxDI7.isChecked) {
                        textoDI.setText("")
                        horasDI=0
                    } else if (!checked) {
                        horasDI += -1
                        textoDI.setText("Desarrollo de Interfaces: " + horasDI)
                    }
                binding.chBoxDI5.id ->
                    if (checked) {
                        horasDI +=1
                        textoDI.setText("Desarrollo de Interfaces: " + horasDI)
                    } else if (!checked && !binding.chBoxDI1.isChecked && !binding.chBoxDI3.isChecked && !binding.chBoxDI4.isChecked &&
                        !binding.chBoxDI1.isChecked && !binding.chBoxDI6.isChecked && !binding.chBoxDI7.isChecked) {
                        textoDI.setText("")
                        horasDI=0
                    } else if (!checked) {
                        horasDI += -1
                        textoDI.setText("Desarrollo de Interfaces: " + horasDI)
                    }
                binding.chBoxDI6.id ->
                    if (checked) {
                        horasDI +=1
                        textoDI.setText("Desarrollo de Interfaces: " + horasDI)
                    } else if (!checked && !binding.chBoxDI1.isChecked && !binding.chBoxDI3.isChecked && !binding.chBoxDI4.isChecked &&
                        !binding.chBoxDI5.isChecked && !binding.chBoxDI1.isChecked && !binding.chBoxDI7.isChecked) {
                        textoDI.setText("")
                        horasDI=0
                    } else if (!checked) {
                        horasDI += -1
                        textoDI.setText("Desarrollo de Interfaces: " + horasDI)
                    }
                binding.chBoxDI7.id ->
                    if (checked) {
                        horasDI +=1
                        textoDI.setText("Desarrollo de Interfaces: " + horasDI)
                    } else if (!checked && !binding.chBoxDI1.isChecked && !binding.chBoxDI3.isChecked && !binding.chBoxDI4.isChecked &&
                        !binding.chBoxDI5.isChecked && !binding.chBoxDI6.isChecked && !binding.chBoxDI1.isChecked) {
                        textoDI.setText("")
                        horasDI=0
                    } else if (!checked) {
                        horasDI += -1
                        textoDI.setText("Desarrollo de Interfaces: " + horasDI)
                    }
                //Sistemas de Gestion Empresarial - SGE
                binding.chBoxSGE1.id ->
                    if (checked) {
                        horasSGE +=1
                        textoSGE.setText("Sistemas de Gesti??n Empresarial: " + horasSGE)
                    } else if (!checked && !binding.chBoxSGE2.isChecked && !binding.chBoxSGE3.isChecked && !binding.chBoxSGE4.isChecked) {
                        textoSGE.setText("")
                        horasSGE=0
                    } else if (!checked) {
                        horasSGE += -1
                        textoSGE.setText("Sistemas de Gesti??n Empresarial: " + horasSGE)
                    }
                binding.chBoxSGE2.id ->
                    if (checked) {
                        horasSGE +=1
                        textoSGE.setText("Sistemas de Gesti??n Empresarial: " + horasSGE)
                    } else if (!checked && !binding.chBoxSGE1.isChecked && !binding.chBoxSGE3.isChecked && !binding.chBoxSGE4.isChecked) {
                        textoSGE.setText("")
                        horasSGE=0
                    } else if (!checked) {
                        horasSGE += -1
                        textoSGE.setText("Sistemas de Gesti??n Empresarial: " + horasSGE)
                    }
                binding.chBoxSGE3.id ->
                    if (checked) {
                        horasSGE +=1
                        textoSGE.setText("Sistemas de Gesti??n Empresarial: " + horasSGE)
                    } else if (!checked && !binding.chBoxSGE2.isChecked && !binding.chBoxSGE1.isChecked && !binding.chBoxSGE4.isChecked) {
                        textoSGE.setText("")
                        horasSGE=0
                    } else if (!checked) {
                        horasSGE += -1
                        textoSGE.setText("Sistemas de Gesti??n Empresarial: " + horasSGE)
                    }
                binding.chBoxSGE4.id ->
                    if (checked) {
                        horasSGE +=1
                        textoSGE.setText("Sistemas de Gesti??n Empresarial: " + horasSGE)
                    } else if (!checked && !binding.chBoxSGE2.isChecked && !binding.chBoxSGE3.isChecked && !binding.chBoxSGE1.isChecked) {
                        textoSGE.setText("")
                        horasSGE=0
                    } else if (!checked) {
                        horasSGE += -1
                        textoSGE.setText("Sistemas de Gesti??n Empresarial: " + horasSGE)
                    }
                //Programacion de servicios y procesoso - PSP
                binding.chBoxPSP1.id ->
                    if (checked) {
                        horasPSP +=1
                        textoPSP.setText("Programaci??n de Servicios y Procesos " + horasPSP)
                    } else if (!checked && !binding.chBoxPSP2.isChecked && !binding.chBoxPSP3.isChecked) {
                        textoPSP.setText("")
                        horasPSP=0
                    } else if (!checked) {
                        horasPSP += -1
                        textoPSP.setText("Programaci??n de Servicios y Procesos " + horasPSP)
                    }
                binding.chBoxPSP2.id ->
                    if (checked) {
                        horasPSP +=1
                        textoPSP.setText("Programaci??n de Servicios y Procesos " + horasPSP)
                    } else if (!checked && !binding.chBoxPSP1.isChecked && !binding.chBoxPSP3.isChecked) {
                        textoPSP.setText("")
                        horasPSP=0
                    } else if (!checked) {
                        horasPSP += -1
                        textoPSP.setText("Programaci??n de Servicios y Procesos " + horasPSP)
                    }
                binding.chBoxPSP3.id ->
                    if (checked) {
                        horasPSP +=1
                        textoPSP.setText("Programaci??n de Servicios y Procesos " + horasPSP)
                    } else if (!checked && !binding.chBoxPSP2.isChecked && !binding.chBoxPSP1.isChecked) {
                        textoPSP.setText("")
                        horasPSP=0
                    } else if (!checked) {
                        horasPSP += -1
                        textoPSP.setText("Programaci??n de Servicios y Procesos " + horasPSP)
                    }
                //Empresa e Iniciativa Emprendedora
                binding.chBoxEIE1.id ->
                    if (checked) {
                        horasEIE +=1
                        textoEIE.setText("Empresa e Iniciativa Emprendedora: " + horasEIE)
                    } else if (!checked && !binding.chBoxEIE2.isChecked && !binding.chBoxEIE3.isChecked && !binding.chBoxEIE4.isChecked) {
                        textoEIE.setText("")
                        horasEIE=0
                    } else if (!checked) {
                        horasEIE += -1
                        textoEIE.setText("Empresa e Iniciativa Emprendedora: " + horasEIE)
                    }
                binding.chBoxEIE2.id ->
                    if (checked) {
                        horasEIE +=1
                        textoEIE.setText("Empresa e Iniciativa Emprendedora: " + horasEIE)
                    } else if (!checked && !binding.chBoxEIE1.isChecked && !binding.chBoxEIE3.isChecked && !binding.chBoxEIE4.isChecked) {
                        textoEIE.setText("")
                        horasEIE=0
                    } else if (!checked) {
                        horasEIE += -1
                        textoEIE.setText("Empresa e Iniciativa Emprendedora: " + horasEIE)
                    }
                binding.chBoxEIE3.id ->
                    if (checked) {
                        horasEIE +=1
                        textoEIE.setText("Empresa e Iniciativa Emprendedora: " + horasEIE)
                    } else if (!checked && !binding.chBoxEIE1.isChecked && !binding.chBoxEIE1.isChecked && !binding.chBoxEIE4.isChecked) {
                        textoEIE.setText("")
                        horasEIE=0
                    } else if (!checked) {
                        horasEIE += -1
                        textoEIE.setText("Empresa e Iniciativa Emprendedora: " + horasEIE)
                    }
                binding.chBoxEIE4.id ->
                    if (checked) {
                        horasEIE +=1
                        textoEIE.setText("Empresa e Iniciativa Emprendedora: " + horasEIE)
                    } else if (!checked && !binding.chBoxEIE1.isChecked && !binding.chBoxEIE1.isChecked && !binding.chBoxEIE1.isChecked) {
                        textoEIE.setText("")
                        horasEIE=0
                    } else if (!checked) {
                        horasEIE += -1
                        textoEIE.setText("Empresa e Iniciativa Emprendedora: " + horasEIE)
                    }
            }
        }
    }
}