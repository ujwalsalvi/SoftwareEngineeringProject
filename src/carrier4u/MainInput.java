package carrier4u;
import javax.swing.ButtonGroup;

public final class MainInput extends javax.swing.JFrame {
     
    private void minDesireGroup(){
        ButtonGroup minDesire = new ButtonGroup();
        minDesire.add(Minutes1000);
        minDesire.add(Minutes10000);
        minDesire.add(Minutes5000);
        minDesire.add(MinutesUnlimited);   
    }
    
    private void dataDesireGroup(){
        ButtonGroup dataDesire = new ButtonGroup();
        dataDesire.add(Data10GB);
        dataDesire.add(Data3GB);
        dataDesire.add(Data5GB);
        dataDesire.add(DataUnlimited);
    }
    
    private void textDesireGroup(){
        ButtonGroup textDesire = new ButtonGroup();
        textDesire.add(Text1000);
        textDesire.add(Text10000);
        textDesire.add(Text5000);
        textDesire.add(TextUnlimited);
    }
    
    private void busEmailGroup(){
        ButtonGroup busEmail = new ButtonGroup();
        busEmail.add(BusinessMailNo);
        busEmail.add(BusinessMailYes);    
    }
    
    private void musicStreamGroup(){
        ButtonGroup musicStream = new ButtonGroup();
        musicStream.add(MusicSteamingNo);
        musicStream.add(MusicSteamingYes);
    }
    
    private void famPlanGroup(){
         ButtonGroup famPlan = new ButtonGroup();
         famPlan.add(FamilyPlanNo);
         famPlan.add(FamilyPlanYes);
    }
    
    private void intCallGroup(){
         ButtonGroup intCall = new ButtonGroup();
         intCall.add(InternationalCallingNo);
         intCall.add(InternationalCallingYes);
    }
    
    private void intTextGroup(){
         ButtonGroup intText = new ButtonGroup();
         intText.add(InternationalTextingNo);
         intText.add(InternationalTextingYes);
    }
    
    private void signalCoverGroup(){
         ButtonGroup signalCover = new ButtonGroup();
         signalCover.add(SignalPoor);
         signalCover.add(SignalFair);
         signalCover.add(SignalGood);
         signalCover.add(SignalExcellent);
    }
    
    private void networkGroup(){
         ButtonGroup network = new ButtonGroup();
         network.add(NetworkCDMA);
         network.add(NetworkGSM);
    }
    
    private void mmsGroup(){
         ButtonGroup mms = new ButtonGroup();
         mms.add(MMSno);
         mms.add(MMSyes);
    }
    
    public void locationGroup(){
         ButtonGroup location = new ButtonGroup();
         location.add(LocationBasedNo);
         location.add(LocationBasedYes);
    }
  
    public MainInput() {
        initComponents();
        busEmailGroup();
        minDesireGroup();
        dataDesireGroup();
        textDesireGroup();
        musicStreamGroup();
        famPlanGroup();
        intCallGroup();
        intTextGroup();
        signalCoverGroup();
        networkGroup();
        mmsGroup();
        locationGroup();
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        BusinessEmail = new javax.swing.JLabel();
        BusinessMailYes = new javax.swing.JRadioButton();
        BusinessMailNo = new javax.swing.JRadioButton();
        MusicStreaming = new javax.swing.JLabel();
        FamilyPlanNo = new javax.swing.JRadioButton();
        FamilyPlanYes = new javax.swing.JRadioButton();
        FamilyPlan = new javax.swing.JLabel();
        InternationalCallingYes = new javax.swing.JRadioButton();
        InternationalCallingNo = new javax.swing.JRadioButton();
        InternationalCalling = new javax.swing.JLabel();
        InternationalTextingNo = new javax.swing.JRadioButton();
        InternationalTextingYes = new javax.swing.JRadioButton();
        InternationalTexting = new javax.swing.JLabel();
        InternetSpeed = new javax.swing.JLabel();
        Internet3G = new javax.swing.JRadioButton();
        Internet2G = new javax.swing.JRadioButton();
        InternetLTE = new javax.swing.JRadioButton();
        SignalStrength = new javax.swing.JLabel();
        RoamingStrength = new javax.swing.JLabel();
        NetworkType = new javax.swing.JLabel();
        DesiredOS = new javax.swing.JLabel();
        MMS = new javax.swing.JLabel();
        LocationBased = new javax.swing.JLabel();
        NetworkGSM = new javax.swing.JRadioButton();
        NetworkCDMA = new javax.swing.JRadioButton();
        IOS = new javax.swing.JRadioButton();
        OtherOS = new javax.swing.JRadioButton();
        AndroidOS = new javax.swing.JRadioButton();
        MMSno = new javax.swing.JRadioButton();
        MMSyes = new javax.swing.JRadioButton();
        LocationBasedNo = new javax.swing.JRadioButton();
        LocationBasedYes = new javax.swing.JRadioButton();
        SubmitButton = new javax.swing.JButton();
        MusicSteamingYes = new javax.swing.JRadioButton();
        MusicSteamingNo = new javax.swing.JRadioButton();
        AnalysisOfCarriers = new javax.swing.JButton();
        Minutes1000 = new javax.swing.JRadioButton();
        Minutes5000 = new javax.swing.JRadioButton();
        Minutes10000 = new javax.swing.JRadioButton();
        MinutesUnlimited = new javax.swing.JRadioButton();
        DataUnlimited = new javax.swing.JRadioButton();
        Data10GB = new javax.swing.JRadioButton();
        Data5GB = new javax.swing.JRadioButton();
        Data3GB = new javax.swing.JRadioButton();
        TextUnlimited = new javax.swing.JRadioButton();
        Text10000 = new javax.swing.JRadioButton();
        Text5000 = new javax.swing.JRadioButton();
        Text1000 = new javax.swing.JRadioButton();
        SignalPoor = new javax.swing.JRadioButton();
        SignalFair = new javax.swing.JRadioButton();
        SignalGood = new javax.swing.JRadioButton();
        SignalExcellent = new javax.swing.JRadioButton();
        NorthEast = new javax.swing.JRadioButton();
        SouthEast = new javax.swing.JRadioButton();
        MidWest = new javax.swing.JRadioButton();
        West = new javax.swing.JRadioButton();
        ResetButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jRadioButton8.setText("Yes");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jRadioButton7.setText("No");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Representative View");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Carrier4U");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setAlignmentX(0.1F);
        jLabel1.setPreferredSize(new java.awt.Dimension(34, 12));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel3.setText("Total Minutes Desired:");

        jLabel4.setText("Total Data Desired:");

        jLabel5.setText("Total Text Desired:");

        BusinessEmail.setText("Business Email");

        BusinessMailYes.setText("Yes");
        BusinessMailYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusinessMailYesActionPerformed(evt);
            }
        });

        BusinessMailNo.setText("No");
        BusinessMailNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusinessMailNoActionPerformed(evt);
            }
        });

        MusicStreaming.setText("Music Streaming");

        FamilyPlanNo.setText("No");
        FamilyPlanNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FamilyPlanNoActionPerformed(evt);
            }
        });

        FamilyPlanYes.setText("Yes");
        FamilyPlanYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FamilyPlanYesActionPerformed(evt);
            }
        });

        FamilyPlan.setText("Family Plan");

        InternationalCallingYes.setText("Yes");
        InternationalCallingYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InternationalCallingYesActionPerformed(evt);
            }
        });

        InternationalCallingNo.setText("No");
        InternationalCallingNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InternationalCallingNoActionPerformed(evt);
            }
        });

        InternationalCalling.setText("International Calling");

        InternationalTextingNo.setText("No");
        InternationalTextingNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InternationalTextingNoActionPerformed(evt);
            }
        });

        InternationalTextingYes.setText("Yes");
        InternationalTextingYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InternationalTextingYesActionPerformed(evt);
            }
        });

        InternationalTexting.setText("International Texting");

        InternetSpeed.setText("Speed of Internet");

        Internet3G.setText("3G");
        Internet3G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Internet3GActionPerformed(evt);
            }
        });

        Internet2G.setText("2G");
        Internet2G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Internet2GActionPerformed(evt);
            }
        });

        InternetLTE.setText("LTE");
        InternetLTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InternetLTEActionPerformed(evt);
            }
        });

        SignalStrength.setText("Signal Coverage");

        RoamingStrength.setText("Region");

        NetworkType.setText("Type Of Network");

        DesiredOS.setText("Cell Phone OS");

        MMS.setText("MMS");

        LocationBased.setText("Location Based");

        NetworkGSM.setText("GSM");
        NetworkGSM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetworkGSMActionPerformed(evt);
            }
        });

        NetworkCDMA.setText("CDMA");
        NetworkCDMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetworkCDMAActionPerformed(evt);
            }
        });

        IOS.setText("IOS");
        IOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IOSActionPerformed(evt);
            }
        });

        OtherOS.setText("Other");
        OtherOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherOSActionPerformed(evt);
            }
        });

        AndroidOS.setText("Andriod");
        AndroidOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AndroidOSActionPerformed(evt);
            }
        });

        MMSno.setText("No");
        MMSno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMSnoActionPerformed(evt);
            }
        });

        MMSyes.setText("Yes");
        MMSyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMSyesActionPerformed(evt);
            }
        });

        LocationBasedNo.setText("No");
        LocationBasedNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationBasedNoActionPerformed(evt);
            }
        });

        LocationBasedYes.setText("Yes");
        LocationBasedYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationBasedYesActionPerformed(evt);
            }
        });

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        MusicSteamingYes.setText("Yes");
        MusicSteamingYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusicSteamingYesActionPerformed(evt);
            }
        });

        MusicSteamingNo.setText("No");
        MusicSteamingNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusicSteamingNoActionPerformed(evt);
            }
        });

        AnalysisOfCarriers.setText("Analyze");
        AnalysisOfCarriers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalysisOfCarriersActionPerformed(evt);
            }
        });

        Minutes1000.setText("<1000");
        Minutes1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Minutes1000ActionPerformed(evt);
            }
        });

        Minutes5000.setText("<5000");
        Minutes5000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Minutes5000ActionPerformed(evt);
            }
        });

        Minutes10000.setText("<10000");
        Minutes10000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Minutes10000ActionPerformed(evt);
            }
        });

        MinutesUnlimited.setText("Unlimited");
        MinutesUnlimited.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinutesUnlimitedActionPerformed(evt);
            }
        });

        DataUnlimited.setText("Unlimited");
        DataUnlimited.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataUnlimitedActionPerformed(evt);
            }
        });

        Data10GB.setText("10GB");
        Data10GB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Data10GBActionPerformed(evt);
            }
        });

        Data5GB.setText("5GB");
        Data5GB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Data5GBActionPerformed(evt);
            }
        });

        Data3GB.setText("3GB");
        Data3GB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Data3GBActionPerformed(evt);
            }
        });

        TextUnlimited.setText("Unlimited");
        TextUnlimited.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUnlimitedActionPerformed(evt);
            }
        });

        Text10000.setText("<10000");
        Text10000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text10000ActionPerformed(evt);
            }
        });

        Text5000.setText("<5000");
        Text5000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text5000ActionPerformed(evt);
            }
        });

        Text1000.setText("<1000");
        Text1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text1000ActionPerformed(evt);
            }
        });

        SignalPoor.setText("Poor");
        SignalPoor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignalPoorActionPerformed(evt);
            }
        });

        SignalFair.setText("Fair");
        SignalFair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignalFairActionPerformed(evt);
            }
        });

        SignalGood.setText("Good");
        SignalGood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignalGoodActionPerformed(evt);
            }
        });

        SignalExcellent.setText("Excellent");
        SignalExcellent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignalExcellentActionPerformed(evt);
            }
        });

        NorthEast.setText("North East");
        NorthEast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NorthEastActionPerformed(evt);
            }
        });

        SouthEast.setText("South East");
        SouthEast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SouthEastActionPerformed(evt);
            }
        });

        MidWest.setText("Mid West");
        MidWest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MidWestActionPerformed(evt);
            }
        });

        West.setText("West");
        West.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WestActionPerformed(evt);
            }
        });

        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Compare");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(232, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InternetSpeed)
                            .addComponent(RoamingStrength))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(Internet2G)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Internet3G)
                                .addGap(12, 12, 12)
                                .addComponent(InternetLTE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(NorthEast)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SouthEast)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MidWest)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(West)
                                .addContainerGap())))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Data3GB, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Data5GB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Data10GB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DataUnlimited)
                                .addGap(16, 16, 16))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(BusinessEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BusinessMailYes)
                                .addGap(12, 12, 12)
                                .addComponent(BusinessMailNo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(MMS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MMSyes)
                                .addGap(12, 12, 12)
                                .addComponent(MMSno))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(DesiredOS)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(IOS)
                                        .addGap(12, 12, 12)
                                        .addComponent(AndroidOS))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(NetworkType)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(NetworkGSM)))
                                .addGap(12, 12, 12)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NetworkCDMA)
                                    .addComponent(OtherOS)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LocationBased)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(AnalysisOfCarriers)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(ResetButton)
                                        .addGap(18, 18, 18)))
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(LocationBasedYes)
                                        .addGap(12, 12, 12)
                                        .addComponent(LocationBasedNo))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(SubmitButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2)
                                        .addGap(8, 8, 8))))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MusicStreaming)
                                    .addComponent(FamilyPlan)
                                    .addComponent(InternationalCalling)
                                    .addComponent(InternationalTexting))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(FamilyPlanYes)
                                        .addGap(12, 12, 12)
                                        .addComponent(FamilyPlanNo))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(MusicSteamingYes)
                                        .addGap(12, 12, 12)
                                        .addComponent(MusicSteamingNo))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(InternationalTextingYes)
                                        .addGap(12, 12, 12)
                                        .addComponent(InternationalTextingNo))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(InternationalCallingYes)
                                        .addGap(12, 12, 12)
                                        .addComponent(InternationalCallingNo)))))
                        .addContainerGap())
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Minutes1000, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Minutes5000)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Minutes10000)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MinutesUnlimited)
                        .addContainerGap())
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Text1000, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text5000)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text10000)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextUnlimited)
                        .addGap(23, 23, 23))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(SignalStrength)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SignalPoor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SignalFair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SignalGood)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SignalExcellent)
                        .addGap(17, 17, 17))))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Minutes1000, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Minutes5000)
                    .addComponent(Minutes10000)
                    .addComponent(MinutesUnlimited))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Data3GB, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Data5GB)
                    .addComponent(Data10GB)
                    .addComponent(DataUnlimited))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Text1000, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text5000)
                    .addComponent(Text10000)
                    .addComponent(TextUnlimited))
                .addGap(6, 6, 6)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BusinessEmail)
                    .addComponent(BusinessMailYes)
                    .addComponent(BusinessMailNo))
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MusicSteamingYes)
                            .addComponent(MusicSteamingNo)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MusicStreaming)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(FamilyPlanYes)
                                    .addComponent(FamilyPlanNo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(InternationalCallingYes)
                                    .addComponent(InternationalCallingNo)))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(FamilyPlan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(InternationalCalling)))
                        .addGap(2, 2, 2)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InternationalTexting)
                            .addComponent(InternationalTextingYes)
                            .addComponent(InternationalTextingNo))))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InternetSpeed)
                    .addComponent(Internet3G)
                    .addComponent(Internet2G)
                    .addComponent(InternetLTE))
                .addGap(32, 32, 32)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(SignalStrength)
                        .addGap(37, 37, 37)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(NorthEast, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SouthEast)
                                .addComponent(MidWest)
                                .addComponent(West))
                            .addComponent(RoamingStrength)))
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SignalPoor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SignalFair)
                        .addComponent(SignalGood)
                        .addComponent(SignalExcellent)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NetworkType)
                    .addComponent(NetworkGSM)
                    .addComponent(NetworkCDMA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DesiredOS)
                    .addComponent(IOS)
                    .addComponent(OtherOS)
                    .addComponent(AndroidOS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MMS)
                    .addComponent(MMSyes)
                    .addComponent(MMSno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LocationBasedYes)
                        .addComponent(LocationBasedNo))
                    .addComponent(LocationBased))
                .addGap(32, 32, 32)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitButton)
                    .addComponent(AnalysisOfCarriers)
                    .addComponent(ResetButton)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int Verizon = 0;
    int Att = 0;
    int Tmobile = 0;
    int Sprint = 0;
    
    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
       
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void LocationBasedYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationBasedYesActionPerformed
        // TODO add your handling code here:
        Verizon++;
        System.out.println("Verizon has the best Network Coverage.");
    }//GEN-LAST:event_LocationBasedYesActionPerformed

    private void LocationBasedNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationBasedNoActionPerformed
        // TODO add your handling code here:
        Tmobile++;
        System.out.println("T-Mobile should be economical since Location Based was selected No.");
    }//GEN-LAST:event_LocationBasedNoActionPerformed

    private void MMSyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMSyesActionPerformed
        // TODO add your handling code here:
        Sprint++;
        System.out.println("Sprint Has better MMS prefference to 10MB per transfer.");
    }//GEN-LAST:event_MMSyesActionPerformed

    private void MMSnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMSnoActionPerformed
        // TODO add your handling code here:
        Att++;
        System.out.println("AT&T T-Mobile and Verizon allows upto 1MB per transfer.");
    }//GEN-LAST:event_MMSnoActionPerformed

    private void AndroidOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AndroidOSActionPerformed
        // TODO add your handling code here:
        Tmobile++;
        Att++;
        System.out.println("Android OS has a better Support on GSM carrier which are T-Mobile and AT&T.");
    }//GEN-LAST:event_AndroidOSActionPerformed

    private void OtherOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherOSActionPerformed
        Verizon++;
        Att++;
        Tmobile++;
        Sprint++;
        System.out.println("Other OS works better on all Carriers.");
        // TODO add your handling code here:
    }//GEN-LAST:event_OtherOSActionPerformed

    private void IOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IOSActionPerformed
        Verizon++;
        Sprint++;
        System.out.println("Apple iOS works better on CDMA Carriers such as Verizon and Sprint.");
        // TODO add your handling code here:
    }//GEN-LAST:event_IOSActionPerformed

    private void NetworkCDMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetworkCDMAActionPerformed
        Verizon++;
        Sprint++;
        System.out.println("CDMA Carriers are Verizon and Sprint.");
        // TODO add your handling code here:
    }//GEN-LAST:event_NetworkCDMAActionPerformed

    private void NetworkGSMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetworkGSMActionPerformed
        Att++;
        Tmobile++;
        System.out.println("GSM Carriers are Tmobile and AT&T.");
        // TODO add your handling code here:
    }//GEN-LAST:event_NetworkGSMActionPerformed

    private void InternetLTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InternetLTEActionPerformed
        Verizon++;
        Tmobile++;
        System.out.println("Best LTE Carriers are T-Mobile and Verizon.");
        // TODO add your handling code here:
    }//GEN-LAST:event_InternetLTEActionPerformed

    private void Internet2GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Internet2GActionPerformed
        Sprint++;
        System.out.println("Best 2G Carrier is Sprint.");
        // TODO add your handling code here:
    }//GEN-LAST:event_Internet2GActionPerformed

    private void Internet3GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Internet3GActionPerformed
        Att++;
        System.out.println("Best 3G Carrier is AT&T.");
        // TODO add your handling code here:
    }//GEN-LAST:event_Internet3GActionPerformed

    private void InternationalTextingYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InternationalTextingYesActionPerformed
        Att++;
        Tmobile++;
        System.out.println("T-Mobile and AT&T has better International texting plan since they are global.");
        // TODO add your handling code here:
    }//GEN-LAST:event_InternationalTextingYesActionPerformed

    private void InternationalTextingNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InternationalTextingNoActionPerformed
        Verizon++;
        Sprint++;
        System.out.println("Verizon and Sprint dont offer International texting plan since they are CDMA.");
     // TODO add your handling code here:
    }//GEN-LAST:event_InternationalTextingNoActionPerformed

    private void InternationalCallingNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InternationalCallingNoActionPerformed
         System.out.println("Verizon and Sprint dont offer International Calling since they are CDMA.");
        Verizon++;
        Sprint++;
        
        // TODO add your handling code here:
    }//GEN-LAST:event_InternationalCallingNoActionPerformed

    private void InternationalCallingYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InternationalCallingYesActionPerformed
           System.out.println("T-Mobile and AT&T has better International texting plan since they are global.");
         
        Tmobile++;
        Att++;// TODO add your handling code here:
    }//GEN-LAST:event_InternationalCallingYesActionPerformed

    private void FamilyPlanYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FamilyPlanYesActionPerformed
             System.out.println("T-Mobile and AT&T both offer $100 for 4 lines plan.");
         
        Tmobile++;
        Att++;// TODO add your handling code here:
    }//GEN-LAST:event_FamilyPlanYesActionPerformed

    private void FamilyPlanNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FamilyPlanNoActionPerformed
       System.out.println("Verizon and Sprint have the best single line plans startign at $45.");
        Verizon++;
        Sprint++;
        
       // TODO add your handling code here:
    }//GEN-LAST:event_FamilyPlanNoActionPerformed

    private void BusinessMailNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusinessMailNoActionPerformed
        System.out.println("T-Mobile and AT&T arent best on offering Business and Corporate plans.");
     
        Tmobile++;
        Att++;  // TODO add your handling code here:
    }//GEN-LAST:event_BusinessMailNoActionPerformed

    private void BusinessMailYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusinessMailYesActionPerformed
       System.out.println("Verizon and Sprint have the best corporate emails.");
         Verizon++;
        Sprint++;
        // TODO add your handling code here:
    }//GEN-LAST:event_BusinessMailYesActionPerformed

    private void MusicSteamingYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusicSteamingYesActionPerformed
         System.out.println("Tmobile offers Music Streaming which doesnt count against your data.");
        
        Tmobile++;
        // TODO add your handling code here:
    }//GEN-LAST:event_MusicSteamingYesActionPerformed

    private void MusicSteamingNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusicSteamingNoActionPerformed
         System.out.println("Sprint is the only Carrier which still offers unlimited data.");
       //Verizon++;
        Sprint++;
      
         // TODO add your handling code here:
    }//GEN-LAST:event_MusicSteamingNoActionPerformed

    private void AnalysisOfCarriersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalysisOfCarriersActionPerformed
        System.out.println("Verizon has " + Verizon + " points.");
        System.out.println("At&t has " + Att + " points.");
        System.out.println("T-Mobile has " + Tmobile + " points.");
        System.out.println("Sprint has " + Sprint + " points.");
    }//GEN-LAST:event_AnalysisOfCarriersActionPerformed

    private void Minutes1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Minutes1000ActionPerformed
        System.out.println("Verizon has A good network plan for 1000 Minutes.");
        Verizon++;
        // TODO add your handling code here:
    }//GEN-LAST:event_Minutes1000ActionPerformed

    private void Minutes10000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Minutes10000ActionPerformed
       System.out.println("Sprint has A good network plan for 10000 Minutes.");
        Sprint++;// TODO add your handling code here:
    }//GEN-LAST:event_Minutes10000ActionPerformed

    private void Data10GBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Data10GBActionPerformed
        Tmobile++;// TODO add your handling code here:
        System.out.println("Tmobile has A good data plan for 10GB.");
    }//GEN-LAST:event_Data10GBActionPerformed

    private void Data3GBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Data3GBActionPerformed
        System.out.println("Verizon has A good Data plan for 3GB.");
        Verizon++;// TODO add your handling code here:
    }//GEN-LAST:event_Data3GBActionPerformed

    private void Text10000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text10000ActionPerformed
        // TODO add your handling code here:
         Sprint++;
        System.out.println("Sprint has A good network plan for 10000 Minutes.");
    }//GEN-LAST:event_Text10000ActionPerformed

    private void Text1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text1000ActionPerformed
        System.out.println("AT&T has A good texting plan for 10000 Texts.");
        Att++;// TODO add your handling code here:
    }//GEN-LAST:event_Text1000ActionPerformed

    private void MinutesUnlimitedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinutesUnlimitedActionPerformed
        System.out.println("Tmobile has A good Network plan for Unlimited Minutes.");
        Tmobile++;
// TODO add your handling code here:
    }//GEN-LAST:event_MinutesUnlimitedActionPerformed

    private void Minutes5000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Minutes5000ActionPerformed
        System.out.println("AT&T has A good Network plan for 5000 Minutes.");
        Att++;// TODO add your handling code here:
    }//GEN-LAST:event_Minutes5000ActionPerformed

    private void Data5GBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Data5GBActionPerformed
         System.out.println("AT&T has A good Data plan for 5GB.");
        Att++;// TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_Data5GBActionPerformed

    private void DataUnlimitedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataUnlimitedActionPerformed
       System.out.println("Sprint has A good data plan for Unlimited.");
        Sprint++; // TODO add your handling code here:
    }//GEN-LAST:event_DataUnlimitedActionPerformed

    private void Text5000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text5000ActionPerformed
       System.out.println("Verizon has A good texting plan for 50000 Texts.");
        Verizon++; // TODO add your handling code here:
    }//GEN-LAST:event_Text5000ActionPerformed

    private void TextUnlimitedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUnlimitedActionPerformed
       System.out.println("Tmobile has A good Network plan for Unlimited Texting.");
        Tmobile++; // TODO add your handling code here:
    }//GEN-LAST:event_TextUnlimitedActionPerformed

    private void SignalPoorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignalPoorActionPerformed
        System.out.println("Sprint has A poor Network Signal Strength.");
        Sprint++;// TODO add your handling code here:
    }//GEN-LAST:event_SignalPoorActionPerformed

    private void SignalFairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignalFairActionPerformed
      System.out.println("Tmobile has A Fair Network Signal Strength.");
        Tmobile++;  // TODO add your handling code here:
    }//GEN-LAST:event_SignalFairActionPerformed

    private void SignalGoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignalGoodActionPerformed
       System.out.println("AT&T has A Good Network Signal Strength.");
        Att++; // TODO add your handling code here:
    }//GEN-LAST:event_SignalGoodActionPerformed

    private void SignalExcellentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignalExcellentActionPerformed
       System.out.println("Verizon has an Excellent Network Signal Strength.");
        Verizon++; // TODO add your handling code here:
    }//GEN-LAST:event_SignalExcellentActionPerformed

    private void NorthEastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NorthEastActionPerformed
       System.out.println("AT&T has an Excellent Network Signal Strength in NorthEast.");
        Att++; // TODO add your handling code here: // TODO add your handling code here:
    }//GEN-LAST:event_NorthEastActionPerformed

    private void SouthEastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SouthEastActionPerformed
       System.out.println("Tmobile has an Excellent Network Signal Strength in South East.");
        Tmobile++; // TODO add your handling code here:
    }//GEN-LAST:event_SouthEastActionPerformed

    private void MidWestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MidWestActionPerformed
       System.out.println("Sprint has an Excellent Network Signal Strength in Mid West.");
        Sprint++; // TODO add your handling code here:
    }//GEN-LAST:event_MidWestActionPerformed

    private void WestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WestActionPerformed
       System.out.println("Verizon has an Excellent Network Signal Strength in West.");
        Verizon++; // TODO add your handling code here:
    }//GEN-LAST:event_WestActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        
        Verizon = 0;
        Att = 0;
        Tmobile = 0;
        Sprint = 0; 
     
        ButtonGroup minDesire = new ButtonGroup();
        minDesire.add(Minutes1000);
        minDesire.add(Minutes10000);
        minDesire.add(Minutes5000);
        minDesire.add(MinutesUnlimited);
        
        ButtonGroup busEmail = new ButtonGroup();
        busEmail.add(BusinessMailNo);
        busEmail.add(BusinessMailYes);
        
        ButtonGroup dataDesire = new ButtonGroup();
        dataDesire.add(Data10GB);
        dataDesire.add(Data3GB);
        dataDesire.add(Data5GB);
        dataDesire.add(DataUnlimited);
        
        ButtonGroup textDesire = new ButtonGroup();
        textDesire.add(Text1000);
        textDesire.add(Text10000);
        textDesire.add(Text5000);
        textDesire.add(TextUnlimited);
        
        ButtonGroup musicStream = new ButtonGroup();
        musicStream.add(MusicSteamingNo);
        musicStream.add(MusicSteamingYes);
        
        ButtonGroup famPlan = new ButtonGroup();
        famPlan.add(FamilyPlanNo);
        famPlan.add(FamilyPlanYes);
        
        ButtonGroup intCall = new ButtonGroup();
        intCall.add(InternationalCallingNo);
        intCall.add(InternationalCallingYes);
        
        ButtonGroup intText = new ButtonGroup();
        intText.add(InternationalTextingNo);
        intText.add(InternationalTextingYes);
        
        ButtonGroup signalCover = new ButtonGroup();
        signalCover.add(SignalPoor);
        signalCover.add(SignalFair);
        signalCover.add(SignalGood);
        signalCover.add(SignalExcellent);
        
        ButtonGroup network = new ButtonGroup();
        network.add(NetworkCDMA);
        network.add(NetworkGSM);
        
        ButtonGroup mms = new ButtonGroup();
        mms.add(MMSno);
        mms.add(MMSyes);
        
        ButtonGroup location = new ButtonGroup();
        location.add(LocationBasedNo);
        location.add(LocationBasedYes);
        
        busEmail.clearSelection();
        minDesire.clearSelection();
        dataDesire.clearSelection();
        textDesire.clearSelection();
        musicStream.clearSelection();
        famPlan.clearSelection();
        intCall.clearSelection();
        intText.clearSelection();
        signalCover.clearSelection();
        network.clearSelection();
        mms.clearSelection();
        location.clearSelection(); 
        
        MidWest.setSelected(false);
        NorthEast.setSelected(false);
        AndroidOS.setSelected(false);
        IOS.setSelected(false);
        OtherOS.setSelected(false);
        SouthEast.setSelected(false);
        West.setSelected(false);
        Internet2G.setSelected(false);
        Internet3G.setSelected(false);
        InternetLTE.setSelected(false);

    }//GEN-LAST:event_ResetButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      dispose();
        Output s = new Output();
        s.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      dispose();
        Logout s = new Logout();
        s.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInput().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnalysisOfCarriers;
    private javax.swing.JRadioButton AndroidOS;
    private javax.swing.JLabel BusinessEmail;
    private javax.swing.JRadioButton BusinessMailNo;
    private javax.swing.JRadioButton BusinessMailYes;
    private javax.swing.JRadioButton Data10GB;
    private javax.swing.JRadioButton Data3GB;
    private javax.swing.JRadioButton Data5GB;
    private javax.swing.JRadioButton DataUnlimited;
    private javax.swing.JLabel DesiredOS;
    private javax.swing.JLabel FamilyPlan;
    private javax.swing.JRadioButton FamilyPlanNo;
    private javax.swing.JRadioButton FamilyPlanYes;
    private javax.swing.JRadioButton IOS;
    private javax.swing.JLabel InternationalCalling;
    private javax.swing.JRadioButton InternationalCallingNo;
    private javax.swing.JRadioButton InternationalCallingYes;
    private javax.swing.JLabel InternationalTexting;
    private javax.swing.JRadioButton InternationalTextingNo;
    private javax.swing.JRadioButton InternationalTextingYes;
    private javax.swing.JRadioButton Internet2G;
    private javax.swing.JRadioButton Internet3G;
    private javax.swing.JRadioButton InternetLTE;
    private javax.swing.JLabel InternetSpeed;
    private javax.swing.JLabel LocationBased;
    private javax.swing.JRadioButton LocationBasedNo;
    private javax.swing.JRadioButton LocationBasedYes;
    private javax.swing.JLabel MMS;
    private javax.swing.JRadioButton MMSno;
    private javax.swing.JRadioButton MMSyes;
    private javax.swing.JRadioButton MidWest;
    private javax.swing.JRadioButton Minutes1000;
    private javax.swing.JRadioButton Minutes10000;
    private javax.swing.JRadioButton Minutes5000;
    private javax.swing.JRadioButton MinutesUnlimited;
    private javax.swing.JRadioButton MusicSteamingNo;
    private javax.swing.JRadioButton MusicSteamingYes;
    private javax.swing.JLabel MusicStreaming;
    private javax.swing.JRadioButton NetworkCDMA;
    private javax.swing.JRadioButton NetworkGSM;
    private javax.swing.JLabel NetworkType;
    private javax.swing.JRadioButton NorthEast;
    private javax.swing.JRadioButton OtherOS;
    private javax.swing.JButton ResetButton;
    private javax.swing.JLabel RoamingStrength;
    private javax.swing.JRadioButton SignalExcellent;
    private javax.swing.JRadioButton SignalFair;
    private javax.swing.JRadioButton SignalGood;
    private javax.swing.JRadioButton SignalPoor;
    private javax.swing.JLabel SignalStrength;
    private javax.swing.JRadioButton SouthEast;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JRadioButton Text1000;
    private javax.swing.JRadioButton Text10000;
    private javax.swing.JRadioButton Text5000;
    private javax.swing.JRadioButton TextUnlimited;
    private javax.swing.JRadioButton West;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
