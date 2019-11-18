/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boose.wordwrap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bboose
 */
public class WordwrapTest {
    private List<String> testList;
    private static final int STR1 = 0;
    private static final int STR2 = 1;
    private static final int STR3 = 2;
    
    
    public WordwrapTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        testList = this.generateTestCases();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createWrappedText method, of class Wordwrap.
     */
    @Test
    public void testCreateWrappedText() {
        System.out.println("createWrappedText");
        testBaseExample();
        testEmptyString();
        testVerboseString();
    }
    
    private void testBaseExample(){
        Wordwrap instance = new Wordwrap(testList.get(STR1), 12);
        String expResult =  "Four score\n" +
                            "and seven\n" +
                            "years ago\n" +
                            "our fathers\n" +
                            "brought\n" +
                            "forth upon\n" +
                            "this\n" +
                            "continent a\n" +
                            "new nation,\n" +
                            "conceived in\n" +
                            "liberty and\n" +
                            "dedicated to\n" +
                            "the\n" +
                            "proposition\n" +
                            "that all men\n" +
                            "are created\n" +
                            "equal";
        String result = instance.createWrappedText();
        assertEquals(expResult, result);
    }
    
    private void testEmptyString() {
        Wordwrap instance = new Wordwrap(testList.get(STR2), 12);
        String expResult = "";
        String result = instance.createWrappedText();
        assertEquals(expResult, result);
    }
    
    private void testVerboseString() {
        Wordwrap instance = new Wordwrap(testList.get(STR3), 12);
        String expResult = "Be at miss\n" +
"or each good\n" +
"play home\n" +
"they. It\n" +
"leave taste\n" +
"mr in it\n" +
"fancy. She\n" +
"son lose\n" +
"does fond\n" +
"bred gave\n" +
"lady get.\n" +
"Sir her\n" +
"company\n" +
"conduct\n" +
"expense bed\n" +
"any. Sister\n" +
"depend\n" +
"change off\n" +
"piqued one.\n" +
"Contented\n" +
"continued\n" +
"any\n" +
"happiness\n" +
"instantly\n" +
"objection\n" +
"yet her\n" +
"allowance.\n" +
"Use correct\n" +
"day new\n" +
"brought\n" +
"tedious. By\n" +
"come this\n" +
"been in.\n" +
"Kept easy or\n" +
"sons my it\n" +
"done. \n" +
"\n" +
"Way\n" +
"nor\n" +
"furnished\n" +
"sir\n" +
"procuring\n" +
"therefore\n" +
"but. Warmth\n" +
"far manner\n" +
"myself\n" +
"active are\n" +
"cannot\n" +
"called. Set\n" +
"her half end\n" +
"girl rich\n" +
"met. Me\n" +
"allowance\n" +
"departure an\n" +
"curiosity ye\n" +
"In no\n" +
"talking\n" +
"address\n" +
"excited it\n" +
"conduct.\n" +
"Husbands\n" +
"debating\n" +
"replying\n" +
"overcame\n" +
"blessing he\n" +
"it me to\n" +
"domestic. \n" +
"\n" +
"Two assure\n" +
"edward\n" +
"whence the\n" +
"was. Who\n" +
"worthy yet\n" +
"ten boy\n" +
"denote\n" +
"wonder.\n" +
"Weeks views\n" +
"her sight\n" +
"old tears\n" +
"sorry.\n" +
"Additions\n" +
"can\n" +
"suspected\n" +
"its\n" +
"concealed\n" +
"put\n" +
"furnished.\n" +
"Met the why\n" +
"particular\n" +
"devonshire\n" +
"decisively\n" +
"considered\n" +
"partiality.\n" +
"Certain it\n" +
"waiting no\n" +
"entered is.\n" +
"Passed her\n" +
"indeed\n" +
"uneasy shy\n" +
"polite\n" +
"appear\n" +
"denied. Oh\n" +
"less girl no\n" +
"walk. At he\n" +
"spot with\n" +
"five of view\n" +
"Be me shall\n" +
"purse my\n" +
"ought times.\n" +
"Joy years\n" +
"doors all\n" +
"would again\n" +
"rooms these.\n" +
"Solicitude\n" +
"announcing\n" +
"as to\n" +
"sufficient\n" +
"my. No my\n" +
"reached\n" +
"suppose\n" +
"proceed\n" +
"pressed\n" +
"perhaps he.\n" +
"Eagerness it\n" +
"delighted\n" +
"pronounce\n" +
"repulsive\n" +
"furniture no\n" +
"Excuse few\n" +
"the remain\n" +
"highly\n" +
"feebly add\n" +
"people\n" +
"manner say.\n" +
"It high at\n" +
"my mind by\n" +
"roof. No\n" +
"wonder\n" +
"worthy in\n" +
"dinner. \n" +
"\n" +
"Oh\n" +
"he\n" +
"decisively\n" +
"impression\n" +
"attachment\n" +
"friendship\n" +
"so if\n" +
"everything.\n" +
"Whose her\n" +
"enjoy chief\n" +
"new young.\n" +
"Felicity if\n" +
"ye required\n" +
"likewise so\n" +
"doubtful. On\n" +
"so attention\n" +
"necessary at\n" +
"by provision\n" +
"otherwise\n" +
"existence\n" +
"direction.\n" +
"Unpleasing\n" +
"up\n" +
"announcing\n" +
"unpleasant\n" +
"themselves\n" +
"oh do on.\n" +
"Way\n" +
"advantage\n" +
"age led\n" +
"listening\n" +
"belonging\n" +
"supposing. \n" +
"\n" +
"Travelling\n" +
"alteration\n" +
"impression\n" +
"six all\n" +
"uncommonly.\n" +
"Chamber\n" +
"hearing\n" +
"inhabit joy\n" +
"highest\n" +
"private ask\n" +
"him our\n" +
"believe. Up\n" +
"nature\n" +
"valley do\n" +
"warmly.\n" +
"Entered of\n" +
"cordial do\n" +
"on no\n" +
"hearted. Yet\n" +
"agreed\n" +
"whence and\n" +
"unable\n" +
"limits. Use\n" +
"off him gay\n" +
"abilities\n" +
"concluded\n" +
"immediate\n" +
"allowance. \n" +
"\n" +
"Unpleasant\n" +
"nor\n" +
"diminution\n" +
"excellence\n" +
"apartments\n" +
"imprudence\n" +
"the met new.\n" +
"Draw part\n" +
"them he an\n" +
"to he roof\n" +
"only. Music\n" +
"leave say\n" +
"doors him.\n" +
"Tore bred\n" +
"form if sigh\n" +
"case as do.\n" +
"Staying he\n" +
"no looking\n" +
"if do\n" +
"opinion.\n" +
"Sentiments\n" +
"way\n" +
"understood\n" +
"end\n" +
"partiality\n" +
"and his. \n" +
"\n" +
"On it\n" +
"differed\n" +
"repeated\n" +
"wandered\n" +
"required in.\n" +
"Then girl\n" +
"neat why yet\n" +
"knew rose\n" +
"spot.\n" +
"Moreover\n" +
"property we\n" +
"he kindness\n" +
"greatest be\n" +
"oh striking\n" +
"laughter. In\n" +
"me he at\n" +
"collecting\n" +
"affronting\n" +
"principles\n" +
"apartments.\n" +
"Has visitor\n" +
"law attacks\n" +
"pretend you\n" +
"calling own\n" +
"excited\n" +
"painted.\n" +
"Contented\n" +
"attending\n" +
"smallness it\n" +
"oh ye\n" +
"unwilling.\n" +
"Turned\n" +
"favour man\n" +
"two but\n" +
"lovers.\n" +
"Suffer\n" +
"should if\n" +
"waited\n" +
"common\n" +
"person\n" +
"little oh.\n" +
"Improved\n" +
"civility\n" +
"graceful sex\n" +
"few smallest\n" +
"screened\n" +
"settling.\n" +
"Likely\n" +
"active her\n" +
"warmly has. \n" +
"As am\n" +
"hastily\n" +
"invited\n" +
"settled at\n" +
"limited\n" +
"civilly\n" +
"fortune me.\n" +
"Really\n" +
"spring in\n" +
"extent an by\n" +
"Judge but\n" +
"built gay\n" +
"party world.\n" +
"Of so am he\n" +
"remember\n" +
"although\n" +
"required.\n" +
"Bachelor\n" +
"unpacked be\n" +
"advanced at.\n" +
"Confined in\n" +
"declared\n" +
"marianne is\n" +
"vicinity. \n" +
"\n" +
"Parish so\n" +
"enable\n" +
"innate in\n" +
"formed\n" +
"missed. Hand\n" +
"two was eat\n" +
"busy fail.\n" +
"Stand smart\n" +
"grave would\n" +
"in so. Be\n" +
"acceptance\n" +
"at\n" +
"precaution\n" +
"astonished\n" +
"excellence\n" +
"thoroughly\n" +
"is\n" +
"entreaties.\n" +
"Who\n" +
"decisively\n" +
"attachment\n" +
"has\n" +
"dispatched.\n" +
"Fruit defer\n" +
"in party me\n" +
"built under\n" +
"first.\n" +
"Forbade him\n" +
"but savings\n" +
"sending ham\n" +
"general. So\n" +
"play do in\n" +
"near park\n" +
"that pain.";
        String result = instance.createWrappedText();
        assertEquals(expResult, result);
    }
    
    private List<String> generateTestCases(){
        // test example case
        String str1 = "Four score and seven years ago our fathers brought forth upon this continent a new nation, conceived in liberty and dedicated to the proposition that all men are created equal";
        // test empty string
        String str2 = "";
        // test large string with words > 13 chars
        String str3 = "Be at miss or each good play home they. It leave taste mr in it fancy. She son lose does fond bred gave lady get. Sir her company conduct expense bed any. Sister depend change off piqued one. Contented continued any happiness instantly objection yet her allowance. Use correct day new brought tedious. By come this been in. Kept easy or sons my it done. \n" +
            "\n" +
            "Way nor furnished sir procuring therefore but. Warmth far manner myself active are cannot called. Set her half end girl rich met. Me allowance departure an curiosity ye. In no talking address excited it conduct. Husbands debating replying overcame blessing he it me to domestic. \n" +
            "\n" +
            "Two assure edward whence the was. Who worthy yet ten boy denote wonder. Weeks views her sight old tears sorry. Additions can suspected its concealed put furnished. Met the why particular devonshire decisively considered partiality. Certain it waiting no entered is. Passed her indeed uneasy shy polite appear denied. Oh less girl no walk. At he spot with five of view. \n" +
            "\n" +
            "Be me shall purse my ought times. Joy years doors all would again rooms these. Solicitude announcing as to sufficient my. No my reached suppose proceed pressed perhaps he. Eagerness it delighted pronounce repulsive furniture no. Excuse few the remain highly feebly add people manner say. It high at my mind by roof. No wonder worthy in dinner. \n" +
            "\n" +
            "Oh he decisively impression attachment friendship so if everything. Whose her enjoy chief new young. Felicity if ye required likewise so doubtful. On so attention necessary at by provision otherwise existence direction. Unpleasing up announcing unpleasant themselves oh do on. Way advantage age led listening belonging supposing. \n" +
            "\n" +
            "Travelling alteration impression six all uncommonly. Chamber hearing inhabit joy highest private ask him our believe. Up nature valley do warmly. Entered of cordial do on no hearted. Yet agreed whence and unable limits. Use off him gay abilities concluded immediate allowance. \n" +
            "\n" +
            "Unpleasant nor diminution excellence apartments imprudence the met new. Draw part them he an to he roof only. Music leave say doors him. Tore bred form if sigh case as do. Staying he no looking if do opinion. Sentiments way understood end partiality and his. \n" +
            "\n" +
            "On it differed repeated wandered required in. Then girl neat why yet knew rose spot. Moreover property we he kindness greatest be oh striking laughter. In me he at collecting affronting principles apartments. Has visitor law attacks pretend you calling own excited painted. Contented attending smallness it oh ye unwilling. Turned favour man two but lovers. Suffer should if waited common person little oh. Improved civility graceful sex few smallest screened settling. Likely active her warmly has. \n" +
            "\n" +
            "As am hastily invited settled at limited civilly fortune me. Really spring in extent an by. Judge but built gay party world. Of so am he remember although required. Bachelor unpacked be advanced at. Confined in declared marianne is vicinity. \n" +
            "\n" +
            "Parish so enable innate in formed missed. Hand two was eat busy fail. Stand smart grave would in so. Be acceptance at precaution astonished excellence thoroughly is entreaties. Who decisively attachment has dispatched. Fruit defer in party me built under first. Forbade him but savings sending ham general. So play do in near park that pain.";

     
        List<String> listOfTestStrings = Stream
        .of(str1, str2, str3)
        .collect(Collectors.toList());
        
        return listOfTestStrings;
    }

    
}
