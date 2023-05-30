-- noinspection SqlNoDataSourceInspectionForFile

-- BannedCard
db.bannedCard.insertMany([{_id: 1, name: "Foolish Burial", allowed_amount: 1},
{_id: 2, name: "Called By the Grave", allowed_amount: 1}]);

-- PrintSets
db.printset.insertMany([
{_id: 1, short_name: "MAMA", long_name: "Magnificent Mavens"},
{_id: 2, short_name: "DASA", long_name: "Dark Saviors"},
{_id: 3, short_name: "SR07", long_name: "Structure Deck: Zombie Horde"},
{_id: 4, short_name: "GFTP", long_name: "Ghosts From the Past"},
{_id: 5, short_name: "MP22", long_name: "2022 Tin of the Pharaoh''s Gods"},
{_id: 6, short_name: "GFP2", long_name: "Ghosts From the Past: The 2nd Haunting"},
{_id: 7, short_name: "DUSA", long_name: "Duellist Saga"},
{_id: 8, short_name: "SESL", long_name: "Secret Slayers"},
{_id: 9, short_name: "LCKC", long_name: "Legendary Collection Kaiba Mega Pack"},
{_id: 10, short_name: "MP19", long_name: "2019 Gold Sarcophagus Tin Mega Pack"},
{_id: 11, short_name: "SDSH", long_name: "Shaddoll Showdown"},
{_id: 12, short_name: "DUOV", long_name: "Duel Overload"},
{_id: 13, short_name: "SD2", long_name: "Zombie Madness"},
{_id: 14, short_name: "EXFO", long_name: "Extreme Force"},
{_id: 15, short_name: "BACH", long_name: "Battle of Chaos"},
]);

-- CardType
db.cardtypes.insertMany([
    {_id: 1, attribute: "Earth"},
    {_id: 2, attribute: "Effect"},
    {_id: 3, attribute: "Tuner"}
]);


-- CardAttribute
db.cardattibutes.insertMany([
    {_id: 1, attribute: "Earth"},
    {_id: 2, attribute: "Trap"},
    {_id: 3, attribute: "Spell"},
    {_id: 4, attribute: "Dark"},
    {_id: 5, attribute: "Fire"}
]);

-- Cards

db.cards.insertMany([
    {_id: 1, card_id: 1, printsets_card_id: '050', rarity: "Ultra Rare", lang_short: "EN", first_edition: true, summonType: "normal summon", description: 'You can banish this card from your GY, then target 1 Zombie monster in your GY; Special Summon that target.', atk: 1700, def: 800, level: 4, name: "Mezuki", imageURL: "https://static.cardmarket.com/img/9d5cdc2d3088cd95d787598e1a735f86/items/5/MAMA/681075.jpg", icon: null, printsets_id: 1, cardattibutes_id: 1},
    {_id: 2, card_id: 51, printsets_card_id: '257', rarity: "Secret Rare", lang_short: "EN", first_edition: true, summonType: "normal summon", description: "When a card or effect is activated that includes any of these effects (Quick Effect): You can discard this card; negate that effect.\n●Add a card from the Deck to the hand.\n●Special Summon from the Deck.\n●Send a card from the Deck to the GY.\nYou can only use this effect of 'Ash Blossom & Joyous Spring' once per turn.", atk: 0, def: 1800, level: 2, name: "Ash Blossom & Joyous Spring", imageURL: "https://static.cardmarket.com/img/daeac6c3348c396ba6d8f098dae33fd9/items/5/MP22/673759.jpg", icon: null, printsets_id: 201, cardattibutes_id: 201},
    {_id: 3, card_id: 101, printsets_card_id: '172', rarity: "Ultra Rare", lang_short: "EN", first_edition: true, summonType: "set", description: 'When a Spell/Trap Card, or monster effect, is activated while you control a "Vampire" monster: Negate the activation, and if you do, destroy that card, then, if it was a Monster Card, gain LP equal to its original ATK. You can only activate 1 "Vampire Domination" per turn.', atk: null, def: null, level: null, name: "Vampire Domination", imageURL: 'https://static.cardmarket.com/img/c32c4366e50ce3df3e4521f6162afa9e/items/5/GFP2/652754.jpg', icon: "Counter", printsets_id: 301, cardattibutes_id: 51},
    {_id: 4, card_id: 151, printsets_card_id: '002', rarity: "Super Rare", lang_short: "EN", first_edition: true, summonType: "normal summon", description: 'If this card is Special Summoned: You can pay 500 LP; add 1 "Vampire" Spell/Trap from your Deck to your hand. If this card is in your GY: You can send 1 "Vampire" card from your hand or face-up field to the GY; Special Summon this card, but banish it when it leaves the field. You can only use each effect of "Vampire Retainer" once per turn.', atk:1200, def: 0, level: 2, name: "Vampire Retainer", imageURL: "https://static.cardmarket.com/img/7c678923a76439ab3781638665ec7cba/items/5/DASA/357215.jpg", icon: null, printsets_id: 51, cardattibutes_id: 151},
    {_id: 5, card_id: 201, printsets_card_id: '070', rarity: "Ultra Rare", lang_short: "EN", first_edition: true, summonType: "normal summon", description: "If this card in your possession is sent to your Graveyard by your opponent''s card (either by battle or by card effect): You can add 1 DARK Vampire monster or 1 Vampire Spell/Trap Card from your Deck to your hand. You can banish this card from your Graveyard; 1 DARK Vampire monster you Normal Summon this turn can be Summoned without Tributing.", atk: 1500, def: 1500, level: 4, name: "Vampire Sorcerer", imageURL: "https://static.cardmarket.com/img/08823eda464b55c73a84c1cc1cd74800/items/5/GFP2/652653.jpg", icon: null, printsets_id: 301, cardattibutes_id: 151},
    {_id: 6, card_id: 251, printsets_card_id: '258', rarity: 'Secret Rare', lang_short: 'EN', first_edition: true, summonType: 'normal summon', description: 'When a card or effect is activated that includes any of these effects (Quick Effect): You can discard this card; negate that activation.\n●Add a card(s) from the GY to the hand, Deck, and/or Extra Deck.\n●Special Summon a Monster Card(s) from the GY.\n●Banish a card(s) from the GY.\nYou can only use this effect of "Ghost Belle & Haunted Mansion" once per turn.',atk:  0, def: 1800, level:  3, name: 'Ghost Belle & Haunted Mansion', imageURL: 'https://static.cardmarket.com/img/41ccbf84f73a34fc076cece99f287748/items/5/MP22/673760.jpg', icon: null, printsets_id: 201, cardattributes_id: 1},

    {_id: 7, card_id: 301, printsets_card_id: '001', rarity: 'Ultra Rare', lang_short:'EN', first_edition: false, summonType: 'special summon', description: 'Cannot be Normal Summoned/Set. Must be Special Summoned (from your hand) by banishing 1 "Vampire Lord" you control, and cannot be Special Summoned by other ways. Once per turn: You can discard 1 Zombie-Type monster to the Graveyard, then target 1 Zombie-Type monster in your Graveyard with a Level less than the discarded Zombie-Type monster''s; Special Summon that target.', atk: 3000, def: 2100,level:  8, name:  'Vampire Genesis', imageURL: 'https://static.cardmarket.com/img/530e266ffc5df3593c4f62deadc89c22/items/5/LCJW/264595.jpg', icon:  null, printsets_id: 601, cardattributes_id: 151}
    {_id: 8, card_id: 351, printsets_card_id: '001', rarity: 'Ultra Rare',lang_short: 'EN', first_edition: false, summonType: 'special summon', description: 'Cannot be Normal Summoned/Set. Must be Special Summoned (from your hand) by banishing 1 "Vampire Lord" you control, and cannot be Special Summoned by other ways. Once per turn: You can discard 1 Zombie-Type monster to the Graveyard, then target 1 Zombie-Type monster in your Graveyard with a Level less than the discarded Zombie-Type monster''s; Special Summon that target.',atk:  3000,def: 2100, level:  8, name: 'Vampire Genesis', imageURL: 'https://static.cardmarket.com/img/530e266ffc5df3593c4f62deadc89c22/items/5/LCJW/264595.jpg', icon: null, printsets_id: 601,cardattributes_id: 151},

    {_id: 9, card_id: 401,printsets_card_id: '237', rarity: 'Common', lang_short: 'EN', first_edition: false, summonType: '1 tribute summon', description: 'If this card is Normal or Special Summoned: You can pay 1000 LP, then target 1 "Vampire" monster in your GY, except "Vampire Scarlet Scourge"; Special Summon it, but it cannot attack this turn. You can only use this effect of "Vampire Scarlet Scourge" once per turn. At the end of the Battle Phase, if this card destroyed any monster(s) by battle: You can Special Summon them from the GYs to your field.',atk: 2200, def: 2200, level: 6, name: 'Vampire Scarlet Scourge', imageURL: 'https://static.cardmarket.com/img/1b517dbe1aa1e0fd7d0de1411e5db34a/items/5/MP19/396157.jpg', icon: null, printsets_id:  451,cardattributes_id: 151},

    { _id: 10, card_id: 451, printsets_card_id: '001', rarity: 'Ultra Rare', lang_short: 'EN',first_edition: true, summonType: '2 tribute summon', description: 'If this card is Normal Summoned: You can target up to 2 monsters in your opponent''s GY; Special Summon those monsters to your field in Defense Position, but their effects are negated. When a monster''s effect is activated, while a monster(s) with its same name is in the GY(s) (Quick Effect): You can negate the activation. If a monster(s) is Special Summoned from your opponent''s GY: You can Tribute 2 monsters; Special Summon this card from your GY. You can only use each effect of "Vampire Voivode" once per turn.',atk: 2800,def: 2100, level: 8, name:'Vampire Voivode', imageURL:'https://static.cardmarket.com/img/a41629a50b7401e2f90c5021499a1522/items/5/GFTP/557723.jpg', icon: null, printsets_id: 151, cardattributes_id: 151},

    { _id: 11,card_id: 501, printsets_card_id: '020', rarity: 'Ultra Rare', lang_short: 'EN',first_edition: true, summonType: 'normal summon', description: 'During your Main Phase: You can send 1 Zombie monster from your Deck to the GY. If this card is sent to the GY: You can banish 1 Zombie monster from your GY, except "Gozuki"; Special Summon 1 Zombie monster from your hand. You can only use each effect of "Gozuki" once per turn.', atk: 1700, def: 800, level: 4, name: 'Gozuki', imageURL: 'https://static.cardmarket.com/img/f9018e89f212ce5e606178b142b69282/items/5/DUSA/296493.jpg', icon: null,printsets_id: 251,cardattributes_id: 1},
    { _id: 12, card_id: 551,printsets_card_id: '001', rarity: 'Super Rare', lang_short:'EN', first_edition:true, summonType: 'normal summon', description: 'If this card is Special Summoned: You can pay 500 LP; add 1 "Vampire" monster from your Deck to your hand, except "Vampire Familiar". If this card is in your GY: You can send 1 "Vampire" card from your hand or face-up field to the GY; Special Summon this card, but banish it when it leaves the field. You can only use each effect of "Vampire Familiar" once per turn.',atk: 500, def: 0, level: 1, name: 'Vampire Familiar', imageURL: 'https://static.cardmarket.com/img/8b8122b775785a17675dc981054b5a70/items/5/DASA/357214.jpg', icon: null,printsets_id: 51, cardattributes_id: 151},
    { _id: 13, card_id: 601,printsets_card_id: '001', rarity: 'Ultra Rare', lang_short:'EN',first_edition: true, summonType: '2 tribute summon', description: 'During the Standby Phase, if a face-up card is in a Field Zone and this card is in your GY: You can Special Summon this card in Defense Position. You can only use this effect of "Doomking Balerdroch" once per turn. Once per Chain, when a Zombie monster, except "Doomking Balerdroch", activates its effect (except during the Damage Step) (Quick Effect): You can apply 1 of these effects (but you cannot apply that same effect of "Doomking Balerdroch" again this turn).\n●Negate that effect.\n●Banish 1 monster from the field or GY.',atk: 2800, def: 2000, level: 8, name: 'Doomking Balerdroch', imageURL:'https://static.cardmarket.com/img/805e499cf2706f99055db92bbf579df5/items/5/SR07/365618.jpg', icon: null, printsets_id: 101,cardattributes_id: 151},
    { _id: 14, card_id: 651, printsets_card_id: '114', rarity: 'Ultra Rare', lang_short:'EN',first_edition: true, summonType: 'normal summon', description: '"Zombie World" in the Field Zone cannot be destroyed by card effects, also neither player can target it with card effects. (Quick Effect): You can banish this card from your field or GY; activate 1 "Zombie World" directly from your hand or Deck. You can only use this effect of "Necroworld Banshee" once per turn.',atk: 1800, def: 200,level: 4,name:  'Necroworld Banshee', imageURL:'https://static.cardmarket.com/img/e71fd227ccd95e5bccabfc35364abb1e/items/5/GFP2/652697.jpg', icon: null, printsets_id: 301, cardattributes_id: 151},
    { _id: 15, card_id: 701, printsets_card_id: '015', rarity: 'Ultra Rare', lang_short:'EN', first_edition:true, summonType: 'normal summon', description: 'If this card is Normal Summoned: You can send 1 other "Vampire" card from your hand or face-up field to the GY; add 1 Level 4 or higher "Vampire" monster from your Deck to your hand, and if you do, send 1 Level 2 or lower "Vampire" monster from your Deck to the GY. During the Main Phase (Quick Effect): You can banish this card from your GY and pay 500 LP; immediately after this effect resolves, Normal Summon 1 "Vampire" monster. You can only use each effect of "Vampire Ghost" once per turn.', atk: 1500,def: 0, level: 3, name: 'Vampire Ghost', imageURL: 'https://static.cardmarket.com/img/97b0f120d58ddc529b221cdd4304cc9d/items/5/BACH/607221.jpg', icon:  null,printsets_id: 701, cardattributes_id: 151},

    { _id: 16, card_id: 751, printsets_card_id: '042', rarity: 'Super Rare', lang_short:'EN', first_edition:true, summonType: 'normal summon', description: 'You can target 1 face-up monster on the field; discard 1 card, and if you do, increase that target''s Level by 1. You can target 1 face-up monster on the field; monsters you control cannot attack for the rest of this turn, except Zombie monsters, also send 1 Zombie monster from your Deck to the GY, and if you do, increase that target''s Level by 1. You can only use each effect of "Uni-Zombie" once per turn.', 1300, 0, 3, 'Uni-Zombie', 'https://static.cardmarket.com/img/a9914cb1d64e08a26abc10697aa96058/items/5/SESL/448533.jpg', icon: null printsets_id:  351, cardattributes_id: 151},
    { _id: 17, card_id: 801, printsets_card_id: '050', rarity: 'Super Rare', lang_short:'EN', first_edition:true, summonType: '2 tribute summon',description:  'Once per turn, when this card or a "Vampire" monster is Normal Summoned to your field: You can target 1 face-up monster your opponent controls, whose ATK is higher than this card''s; equip it to this card. This card gains ATK equal to the combined original ATK of the monsters equipped to it by this effect. If this card is sent to the GY, while equipped with a card(s) by this effect: Special Summon this card.', 2000, 2000, 7, 'Vampire Vamp', 'https://static.cardmarket.com/img/c50f89d12188a23d2cb06344ea285009/items/5/DASA/357263.jpg', icon: null, printsets_id:51, cardattributes_id: 151},
    { _id: 18, card_id: 851, printsets_card_id: '003', rarity: 'Secret Rare', lang_short:'EN',first_edition: true,summonType:  '1 tribute summon', description: 'When a monster declares an attack: You can Special Summon this card from your hand in Defense Position. You can only use this effect of "Vampire Fraulein" once per turn. Once per battle, if your Zombie monster battles an opponent''s monster, during that damage calculation (Quick Effect): You can pay LP in multiples of 100 (max. 3000); your battling monster gains that much ATK/DEF during that damage calculation only. At the end of the Battle Phase, if this card destroyed any monster(s) by battle: You can Special Summon them from the GYs to your field.', atk: 600, def:2000,level: 5,name: 'Vampire Fraulein',imageURL:  'https://static.cardmarket.com/img/a153ff4fbc74f47afac45d295acea51d/items/5/DASA/357216.jpg', icon:  null,printsets_id: 51,cardattributes_id: 151},
    { _id: 19, card_id: 901,printsets_card_id: '024', rarity: 'Ultra Rare', lang_short:'EN',first_edition: true, summonType: '1 tribute summon', description:  'If this card inflicts battle damage to your opponent: Declare 1 type of card (Monster, Spell, or Trap); your opponent sends 1 card of that type from their Deck to the GY. Once per turn, during your next Standby Phase after this card in your possession was destroyed and sent to your GY by an opponent''s card effect: Special Summon this card from the GY.', 2000, 1500, 5, 'Vampire Lord', 'https://static.cardmarket.com/img/e713e7752b8bb11c326fc39f8d49d95c/items/5/LCKC/319627.jpg',icon: null, printsets_id: 401, cardattributes_id:151},

    { _id: 20, card_id: 961,printsets_card_id: '029', rarity: 'Common', lang_short:'EN',first_edition: true, summonType: 'set/activate', description:  'Send 1 monster from your Deck to the GY.', atk: null, def: null, level: null, name:'Foolish Burial', imageURL: 'https://static.cardmarket.com/img/79e3336f6a6257762b139de827a9292b/items/5/SDSH/438929.jpg', icon:  null, printsets_id: 501,cardattibutes_id: 101 },
    { _id: 21, card_id: 1001,printsets_card_id: '091', rarity: 'Ultra Rare', lang_short:'EN',first_edition: true, summonType: 'set/activate', description:  'All monsters on the field and in the GYs become Zombie monsters. Neither player can Tribute Summon monsters, except Zombie monsters.', atk: null,def:  null,level:  null, name:'Zombie World', imageURL: 'https://static.cardmarket.com/img/9274d1a282a820759dbbf43d35d14a4d/items/5/DUOV/442898.jpg', icon: 'Field Spell', printsets_id: 551, cardattributes_id:  101},
    { _id: 21, card_id: 1051, printsets_card_id: '091', rarity: 'Ultra Rare', lang_short:'EN',first_edition: true, summonType: 'set/activate', description:  'All monsters on the field and in the GYs become Zombie monsters. Neither player can Tribute Summon monsters, except Zombie monsters.', atk: null,def:  null,level:  null, name:'Zombie World', imageURL: 'https://static.cardmarket.com/img/9274d1a282a820759dbbf43d35d14a4d/items/5/DUOV/442898.jpg', icon: 'Field Spell', printsets_id: 551, cardattributes_id:  101},

    { _id: 22,card_id: 1101, printsets_card_id: '240', rarity: 'Common', lang_short:'EN',first_edition: true, summon_type: 'set/activate', description:  'Activate 1 of these effects.\n●Target 1 face-up monster you control; send 1 "Vampire" monster from your Deck to the GY with a different Level from that monster, and if you do, the targeted monster becomes the Level of that sent monster in the GY, until the end of this turn.\n●Target 1 "Vampire" monster in your GY; send 1 monster you control to the GY, and if you do, Special Summon the targeted monster.\nYou can only activate 1 "Vampire''s Desire" per turn.', atk: null,def:  null, level: null, name: 'Vampire''s Desire', imageURL: 'https://static.cardmarket.com/img/1b517dbe1aa1e0fd7d0de1411e5db34a/items/5/MP19/396172.jpg', icon: null, printsets_id: 451,cardattributes_id: 101},
    { _id: 23, card_id: null,printsets_card_id: '241', rarity: 'Common', lang_short:'EN', first_edition:true, summon_type: 'set/activate', description:  'Once per turn: You can pay 500 LP; during your Main Phase this turn, you can Normal Summon 1 "Vampire" monster in addition to your Normal Summon/Set. (Even if this card leaves the field. You can only gain this effect once per turn.) Each time your "Vampire" monster inflicts battle damage to your opponent: Gain the same amount of LP.', atk: null, def: null, level:  null,name:  'Vampire''s Domain',imageURL:  'https://static.cardmarket.com/img/e508538fd639235f570699b4546ac5f2/items/5/MP19/396177.jpg', icon: 'Continuous', printsets_id: 451, cardattributes_id: 101},
    { _id: 24, card_id: null printsets_card_id: 'SE2', rarity: 'Super Rare',lang_short: 'EN',first_edition: true, summon_type: 'set/activate', description:  'Target 1 monster in your opponent''s GY; banish it, and if you do, until the end of the next turn, its effects are negated, as well as the activated effects and effects on the field of monsters with the same original name.', atk: null, def: null,level:  null, name: 'Called by the Grave', imageURL: 'https://static.cardmarket.com/img/68ba1c39d3b9f06033448d16eedde776/items/5/EXFO/316254.jpg', icon: 'Quick-Play', printsets_id: 651,  cardattributes: 101}
]);
-- Deck

db.decks.insertOne({ _id: 1, name: "Vampire's End"});


-- DeckCard

db.deckcards.insertMany([
    {amount: 3, card_id: 1, deck_id: 1},
    {amount: 3, card_id: 51, deck_id: 1},
    {amount: 3, card_id: 101, deck_id: 1},
    {amount: 3, card_id: 151, deck_id: 1},
    {amount: 3, card_id: 201, deck_id: 1},
    {amount: 3, card_id: 251, deck_id: 1},
    {amount: 3, card_id: 301, deck_id: 1},
    {amount: 3, card_id: 351, deck_id: 1},
    {amount: 3, card_id: 401, deck_id: 1},
    {amount: 3, card_id: 451, deck_id: 1},
    {amount: 3, card_id: 501, deck_id: 1},
    {amount: 3, card_id: 551, deck_id: 1},
    {amount: 3, card_id: 601, deck_id: 1},
    {amount: 3, card_id: 651, deck_id: 1},
    {amount: 2, card_id: 701, deck_id: 1},
    {amount: 1, card_id: 751, deck_id: 1},
    {amount: 2, card_id: 801, deck_id: 1},
    {amount: 2, card_id: 851, deck_id: 1},
    {amount: 1, card_id: 901, deck_id: 1},
    {amount: 3, card_id: 951, deck_id: 1},
    {amount: 1, card_id: 1001, deck_id: 1},
    {amount: 3, card_id: 1051, deck_id: 1},
    {amount: 1, card_id: 1101, deck_id: 1}
]);
-- deck_deckcard
db.deck_deckcards.insertMany([
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 1},
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 51},
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 101},
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 151},
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 201}, 
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 251},
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 301},
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 351},
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 401},
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 451},
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 501},
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 551},
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 601},
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 651},
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 701},
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 751},
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 801},
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 851},
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 901},
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 951},
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 1001},
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 1051},
    {deck_id: 1, cards_deck_id: 1, cards_card_id: 1101}
]);

-- card_cardtype

db.card_cardtypes.insertMany([{card_id: 1, cardtypes_id: 1},
    {card_id: 1, cardtypes_id: 51},
    {card_id: 51, cardtypes_id: 1},
    {card_id: 51, cardtypes_id: 51},
    {card_id: 51, cardtypes_id: 101},
    {card_id: 151, cardtypes_id: 1},
    {card_id: 151, cardtypes_id: 51},
    {card_id: 201, cardtypes_id: 1},
    {card_id: 201, cardtypes_id: 51},
    {card_id: 251, cardtypes_id: 1},
    {card_id: 251, cardtypes_id: 51},
    {card_id: 301, cardtypes_id: 1},
    {card_id: 301, cardtypes_id: 51},
    {card_id: 351, cardtypes_id: 1},
    {card_id: 351, cardtypes_id: 51},
    {card_id: 401, cardtypes_id: 1},
    {card_id: 401, cardtypes_id: 51},
    {card_id: 451, cardtypes_id: 1},
    {card_id: 451, cardtypes_id: 51},
    {card_id: 501, cardtypes_id: 1},
    {card_id: 501, cardtypes_id: 51},
    {card_id: 551, cardtypes_id: 1},
    {card_id: 551, cardtypes_id: 51},
    {card_id: 601, cardtypes_id: 1},
    {card_id: 601, cardtypes_id: 51},  
    {card_id: 651, cardtypes_id: 1},
    {card_id: 651, cardtypes_id: 51},
    {card_id: 701, cardtypes_id: 1},
    {card_id: 701, cardtypes_id: 51},
    {card_id: 701, cardtypes_id: 101},
    {card_id: 751, cardtypes_id: 1},
    {card_id: 751, cardtypes_id: 51},
    {card_id: 801, cardtypes_id: 1},
    {card_id: 801, cardtypes_id: 51},
    {card_id: 851, cardtypes_id: 1},
    {card_id: 851, cardtypes_id: 51}
]);
