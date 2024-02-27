package br.com.plm.mdm.interactions.PLM;

import br.com.plm.mdm.pages.PLM.HierarquiaPage;
import br.com.renner.robots.IRNRobotsTool;
import br.com.renner.robots.SeleniumRobotsTool;
import org.openqa.selenium.Keys;

import static br.com.plm.mdm.steps.Common.scenario;
import static br.com.plm.mdm.steps.Common.seleniumRobotsTool;
import static br.com.plm.mdm.toolbox.GlobalTools.esperarElementoClicvel;
import static br.com.plm.mdm.toolbox.GlobalTools.esperarElementoWeb;
import static helpers.Utils.addLog;

public class HierarquiaPageInteractions extends HierarquiaPage {

    IRNRobotsTool driverWEB = seleniumRobotsTool;

    public void selecionarSessao(String sessao) throws Exception {

        addLog(scenario, "Etapa: Hierarquia Mercadológica");

        esperarElementoWeb(welcome);
        //esperarElementoClicvel(welcome);


        //driverWEB.waitObject(welcome, 3);
        //desabilitado
        //driverWEB.click(abaEstilo);
        esperarElementoWeb(abaEstiloNew);
        esperarElementoClicvel(abaEstiloNew);
        driverWEB.click(abaEstiloNew);

        //esperarElementoWeb(sessao);
        //esperarElementoClicvel(sessao);
        driverWEB.click(getSessao(sessao));

    }

    public void selecionarDivisao(String divisao) throws Exception {

            //driverWEB.waitObject(divisao, 3);

        esperarElementoWeb(getDivisao(divisao));
        esperarElementoClicvel(getDivisao(divisao));
        driverWEB.click(getDivisao(divisao));
    }

    public void selecionarGrupo(String grupo) throws Exception {

        //driverWEB.waitObject(grupo, 3);

        esperarElementoWeb(getGrupo(grupo));
        esperarElementoClicvel(getGrupo(grupo));
        driverWEB.click(getGrupo(grupo));
    }

    public void selecionarSubClasse(String subClasse) throws Exception {

        //driverWEB.waitObject(subClasse, 3);
        esperarElementoWeb(getSubclasse(subClasse));
        esperarElementoClicvel(getSubclasse(subClasse));
        driverWEB.click(getSubclasse(subClasse));
        //driverWEB.waitObject(subClasse, 3);
    }

    public void clicarBotaoAcao() throws Exception {
        esperarElementoWeb(botaoRefresh);
        esperarElementoClicvel(botaoRefresh);
        driverWEB.click(botaoRefresh);

        esperarElementoWeb(botaoAcao2);
        esperarElementoClicvel(botaoAcao2);
        driverWEB.click(botaoAcao2);
        Thread.sleep(8000);

    }

    public void informarTipoReferencia(String tipoReferencia) throws Exception {


        esperarElementoWeb(campoMarca);
        esperarElementoClicvel(campoMarca);
        driverWEB.click(campoMarca);
        ((SeleniumRobotsTool) driverWEB).getElement(campoMarca).sendKeys(Keys.TAB);

        esperarElementoWeb(campoReferencia);
        esperarElementoClicvel(campoReferencia);
        driverWEB.click(campoReferencia);



        esperarElementoWeb(inputCampoReferencia);
        esperarElementoClicvel(inputCampoReferencia);
        driverWEB.setText(inputCampoReferencia, tipoReferencia);

        esperarElementoWeb(syleTypeStyle);
        esperarElementoClicvel(syleTypeStyle);
        driverWEB.click(syleTypeStyle);
    }



    public void informarMarca(String marca) throws Exception {

        esperarElementoWeb(campoMarca);
        esperarElementoClicvel(campoMarca);
        driverWEB.click(campoMarca);
        driverWEB.setText(campoMarca, marca);
    }

    public void clicarBotaoSalvar() throws Exception {

        esperarElementoWeb(botaoSalvar);
        esperarElementoClicvel(botaoSalvar);
        driverWEB.click(botaoSalvar);
        Thread.sleep(10000);

    }


}
